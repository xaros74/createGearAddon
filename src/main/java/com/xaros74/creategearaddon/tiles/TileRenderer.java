package com.xaros74.creategearaddon.tiles;

import com.jozufozu.flywheel.backend.Backend;
import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileRenderer;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.render.SuperByteBuffer;
import com.simibubi.create.foundation.utility.AnimationTickHolder;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.core.Direction.AxisDirection;

public class TileRenderer extends BracketedKineticTileRenderer {

	public TileRenderer(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void renderSafe(KineticTileEntity te, float partialTicks, PoseStack ms, MultiBufferSource buffer,
		int light, int overlay) {

		if (Backend.canUseInstancing(te.getLevel()))
			return;

		if (!AllBlocks.LARGE_COGWHEEL.has(te.getBlockState())) {
			super.renderSafe(te, partialTicks, ms, buffer, light, overlay);
			return;
		}

		// Large cogs sometimes have to offset their teeth by 11.25 degrees in order to
		// mesh properly

		Axis axis = getRotationAxisOf(te);
		BlockPos pos = te.getBlockPos();

		Direction facing = Direction.fromAxisAndDirection(axis, AxisDirection.POSITIVE);
		renderRotatingBuffer(te,
			CachedBufferer.partialFacingVertical(AllBlockPartials.SHAFTLESS_LARGE_COGWHEEL, te.getBlockState(), facing),
			ms, buffer.getBuffer(RenderType.solid()), light);

		float offset = getShaftAngleOffset(axis, pos);
		float time = AnimationTickHolder.getRenderTime(te.getLevel());
		float angle = ((time * te.getSpeed() * 3f / 10 + offset) % 360) / 180 * (float) Math.PI;

		SuperByteBuffer shaft =
			CachedBufferer.partialFacingVertical(AllBlockPartials.COGWHEEL_SHAFT, te.getBlockState(), facing);
		kineticRotationTransform(shaft, te, axis, angle, light);
		shaft.renderInto(ms, buffer.getBuffer(RenderType.solid()));

	}

}
