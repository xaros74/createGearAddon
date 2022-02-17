package com.xaros74.creategearaddon.blocks;

import com.simibubi.create.content.contraptions.base.IRotate;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;
import com.simibubi.create.content.contraptions.relays.elementary.SimpleKineticTileEntity;
import com.simibubi.create.foundation.utility.Iterate;
import com.xaros74.creategearaddon.index.AllModBlocks;
import com.xaros74.creategearaddon.index.AllModTileEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.AxisDirection;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CogWheel extends CogWheelBlock {
	
	boolean isLarge;
	protected CogWheel(boolean large, Properties properties) {
		super(large, properties);
		isLarge = large;
	}
	
	public static CogWheel small(Properties properties) {
		return new CogWheel(false, properties);
	}

	public static CogWheel large(Properties properties) {
		return new CogWheel(true, properties);
	}
	
	@Override
	public BlockEntityType<? extends SimpleKineticTileEntity> getTileEntityType() {
		return AllModTileEntities.getCOG_TILE().get();
	}
	
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand,
		BlockHitResult ray) {
		if (player.isShiftKeyDown() || !player.mayBuild())
			return InteractionResult.PASS;

		ItemStack heldItem = player.getItemInHand(hand);
		EncasedCogwheel[] encasedBlocks = isLarge
			? new EncasedCogwheel[] { AllModBlocks.ANDESITE_ENCASED_LARGE_COGWHEEL.get(),
				AllModBlocks.BRASS_ENCASED_LARGE_COGWHEEL.get() }
			: new EncasedCogwheel[] { AllModBlocks.ANDESITE_ENCASED_COGWHEEL.get(),
				AllModBlocks.MOD_BRASS_ENCASED_COGWHEEL.get() };

		for (EncasedCogwheel encasedCog : encasedBlocks) {
			if (!encasedCog.getCasing()
				.isIn(heldItem))
				continue;

			if (world.isClientSide)
				return InteractionResult.SUCCESS;

			BlockState encasedState = encasedCog.defaultBlockState()
				.setValue(AXIS, state.getValue(AXIS));

			for (Direction d : Iterate.directionsInAxis(state.getValue(AXIS))) {
				BlockState adjacentState = world.getBlockState(pos.relative(d));
				if (!(adjacentState.getBlock() instanceof IRotate))
					continue;
				IRotate def = (IRotate) adjacentState.getBlock();
				if (!def.hasShaftTowards(world, pos.relative(d), adjacentState, d.getOpposite()))
					continue;
				encasedState =
					encasedState.cycle(d.getAxisDirection() == AxisDirection.POSITIVE ? EncasedCogwheel.TOP_SHAFT
						: EncasedCogwheel.BOTTOM_SHAFT);
			}
			
			KineticTileEntity.switchToBlockState(world, pos, encasedState);
			return InteractionResult.SUCCESS;
		}

		return InteractionResult.PASS;
	}

}
