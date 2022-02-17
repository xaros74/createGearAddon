package com.xaros74.creategearaddon.renderer;

import com.jozufozu.flywheel.backend.Backend;
import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.content.contraptions.base.IRotate;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.relays.encased.EncasedCogRenderer;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.render.SuperByteBuffer;
import com.simibubi.create.foundation.utility.Iterate;
import com.xaros74.creategearaddon.CreateGearAddon;
import com.xaros74.creategearaddon.blocks.AllModBlockPartials;
import com.xaros74.creategearaddon.blocks.EncasedCogwheel;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.AxisDirection;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class EncasedCogWheelRenderer extends EncasedCogRenderer {

	private String CogType;
	private boolean large;
	
	public static EncasedCogWheelRenderer small(BlockEntityRendererProvider.Context context, String type) {
		return new EncasedCogWheelRenderer(context, false, type);
	}

	public static EncasedCogWheelRenderer large(BlockEntityRendererProvider.Context context, String type) {
		return new EncasedCogWheelRenderer(context, true, type);
	}

	public EncasedCogWheelRenderer(Context context, boolean large, String type) {
		super(context, large);
		CreateGearAddon.LOGGER.info("constructor");
		this.large = large;
		this.CogType = type;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void renderSafe(KineticTileEntity te, float partialTicks, PoseStack ms, MultiBufferSource buffer,
		int light, int overlay) {
		CreateGearAddon.LOGGER.info("render safe");
		super.renderSafe(te, partialTicks, ms, buffer, light, overlay);
		if (Backend.getInstance()
			.canUseInstancing(te.getLevel()))
			return;

		BlockState blockState = te.getBlockState();
		Block block = blockState.getBlock();
		if (!(block instanceof IRotate))
			return;
		IRotate def = (IRotate) block;

		for (Direction d : Iterate.directionsInAxis(getRotationAxisOf(te))) {
			if (!def.hasShaftTowards(te.getLevel(), te.getBlockPos(), blockState, d))
				continue;
			renderRotatingBuffer(te, CachedBufferer.partialFacing(AllBlockPartials.SHAFT_HALF, te.getBlockState(), d),
				ms, buffer.getBuffer(RenderType.solid()), light);
		}
	}
	
	@Override
	protected SuperByteBuffer getRotatedModel(KineticTileEntity te) {
		CreateGearAddon.LOGGER.info("why it's not workibgngngjugdjskhs");
		return CachedBufferer.partialFacingVertical(
			large ? AllModBlockPartials.LARGE_SHAFTLESS_OAK_COGWHEEL : AllModBlockPartials.PARTIAL_SHAFTLESS_OAK_COGWHEEL, te.getBlockState(),
			Direction.fromAxisAndDirection(te.getBlockState()
				.getValue(EncasedCogwheel.AXIS), AxisDirection.POSITIVE));
	}

}
