package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.contraptions.base.CasingBlock;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.relays.elementary.SimpleKineticTileEntity;
import com.simibubi.create.content.contraptions.relays.encased.EncasedCogwheelBlock;
import com.simibubi.create.content.schematics.ItemRequirement;
import com.simibubi.create.repack.registrate.util.entry.BlockEntry;
import com.xaros74.creategearaddon.index.AllModBlocks;
import com.xaros74.creategearaddon.index.AllModTileEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class EncasedCogwheel extends EncasedCogwheelBlock {
	
	boolean isLarge;
	private BlockEntry<CasingBlock> casing;
	private String CogType;
	
	public static EncasedCogwheel andesite(boolean large, Properties properties, String type) {
		return new EncasedCogwheel(large, properties, AllBlocks.ANDESITE_CASING, type);
	}

	public static EncasedCogwheel brass(boolean large, Properties properties, String type) {
		return new EncasedCogwheel(large, properties, AllBlocks.BRASS_CASING, type);
	}
	
	public EncasedCogwheel(boolean large, Properties properties, BlockEntry<CasingBlock> casing, String type) {
		super(large, properties, casing);
		isLarge = large;
		this.casing = casing;
		CogType = type;
	}
	
	@Override
	public BlockEntry<CasingBlock> getCasing() {
		return casing;
	}
	
	@Override
	public ItemStack getPickBlock(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		if (target instanceof BlockHitResult)
			return ((BlockHitResult) target).getDirection()
				.getAxis() != getRotationAxis(state)
					? isLarge ? AllModBlocks.LARGE_OAK_COGWHEEL.asStack() : AllModBlocks.OAK_COGWHEEL.asStack()
					: getCasing().asStack();
		return super.getPickBlock(state, target, world, pos, player);
	}
	
	@SuppressWarnings("resource")
	@Override
	public InteractionResult onSneakWrenched(BlockState state, UseOnContext context) {
		LOGGER.info("Blockstate: " + state.getBlock());
		if (context.getLevel().isClientSide)
			return InteractionResult.SUCCESS;
		context.getLevel()
			.levelEvent(2001, context.getClickedPos(), Block.getId(state));
		KineticTileEntity.switchToBlockState(context.getLevel(), context.getClickedPos(),
			(isLarge ? AllModBlocks.LARGE_OAK_COGWHEEL : AllModBlocks.OAK_COGWHEEL).getDefaultState()
				.setValue(AXIS, state.getValue(AXIS)));
		return InteractionResult.SUCCESS;
	}
	
	@Override
	protected boolean areStatesKineticallyEquivalent(BlockState oldState, BlockState newState) {
		if (newState.getBlock() instanceof EncasedCogwheel
			&& oldState.getBlock() instanceof EncasedCogwheel) {
			if (newState.getValue(TOP_SHAFT) != oldState.getValue(TOP_SHAFT))
				return false;
			if (newState.getValue(BOTTOM_SHAFT) != oldState.getValue(BOTTOM_SHAFT))
				return false;
		}
		return super.areStatesKineticallyEquivalent(oldState, newState);
	}
	
	@Override
	public ItemRequirement getRequiredItems(BlockState state, BlockEntity te) {
		return ItemRequirement
			.of(isLarge ? AllModBlocks.LARGE_OAK_COGWHEEL.getDefaultState() : AllModBlocks.OAK_COGWHEEL.getDefaultState(), te);
	}
	
	@Override
	public BlockEntityType<? extends SimpleKineticTileEntity> getTileEntityType() {
		LOGGER.info("nique");
		return isLarge ? AllModTileEntities.getENCASED_LARGE_COGWHEEL().get() : AllModTileEntities.getENCASED_COGWHEEL().get();
	}

}
