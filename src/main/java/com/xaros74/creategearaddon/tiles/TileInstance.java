package com.xaros74.creategearaddon.tiles;

import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.MaterialManager;
import com.jozufozu.flywheel.util.transform.TransformStack;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.base.KineticTileEntityRenderer;
import com.simibubi.create.content.contraptions.base.flwdata.RotatingData;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileInstance;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileRenderer;
import com.simibubi.create.content.contraptions.relays.elementary.ICogWheel;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.core.Direction.AxisDirection;

public class TileInstance extends BracketedKineticTileInstance {

	public TileInstance(MaterialManager modelManager, KineticTileEntity tile) {
		super(modelManager, tile);
		// TODO Auto-generated constructor stub
	}
	
	private PoseStack rotateToAxis(Direction.Axis axis) {
        Direction facing = Direction.fromAxisAndDirection(axis, Direction.AxisDirection.POSITIVE);
        PoseStack poseStack = new PoseStack();

        TransformStack.cast(poseStack)
                .centre()
                .rotateToFace(facing)
                .multiply(Vector3f.XN.rotationDegrees(-90))
                .unCentre();
        return poseStack;
    }
	
	@Override
	public void init() {
		super.init();
		if (!ICogWheel.isLargeCog(blockEntity.getBlockState()))
			return;

		// Large cogs sometimes have to offset their teeth by 11.25 degrees in order to
		// mesh properly

		float speed = blockEntity.getSpeed();
		Axis axis = KineticTileEntityRenderer.getRotationAxisOf(blockEntity);
		BlockPos pos = blockEntity.getBlockPos();
		float offset = BracketedKineticTileRenderer.getShaftAngleOffset(axis, pos);
		Direction facing = Direction.fromAxisAndDirection(axis, AxisDirection.POSITIVE);
		Instancer<RotatingData> half = getRotatingMaterial().getModel(AllBlockPartials.COGWHEEL_SHAFT, blockState,
			facing, () -> this.rotateToAxis(axis));

		additionalShaft = setup(half.createInstance(), speed);
		additionalShaft.setRotationOffset(offset);
	}

}
