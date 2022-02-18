package com.xaros74.creategearaddon.blocks;

import java.util.Optional;

import com.jozufozu.flywheel.backend.instancing.Instancer;
import com.jozufozu.flywheel.backend.material.MaterialManager;
import com.jozufozu.flywheel.core.PartialModel;
import com.jozufozu.flywheel.util.transform.TransformStack;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.content.contraptions.base.IRotate;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.base.flwdata.RotatingData;
import com.simibubi.create.content.contraptions.relays.encased.EncasedCogInstance;
import com.simibubi.create.foundation.utility.Iterate;
import com.xaros74.creategearaddon.index.AllModBlockPartials;

import net.minecraft.core.Direction;
import net.minecraft.core.Direction.AxisDirection;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class EncasedCogWheelInstance extends EncasedCogInstance {
	private boolean large;
	private String cogType;
	
	public static EncasedCogWheelInstance small(MaterialManager modelManager, KineticTileEntity tile, String type) {
		return new EncasedCogWheelInstance(modelManager, tile, false, type);
	}

	public static EncasedCogWheelInstance large(MaterialManager modelManager, KineticTileEntity tile, String type) {
		return new EncasedCogWheelInstance(modelManager, tile, true, type);
	}

	public EncasedCogWheelInstance(MaterialManager modelManager, KineticTileEntity tile, boolean large, String type) {
		super(modelManager, tile, large);
		this.large = large;
		this.cogType = type;
	}
	
	@Override
	public void init() {
		rotatingModel = setup(getCogModel().createInstance());

		Block block = blockState.getBlock();
		if (!(block instanceof IRotate))
			return;

		IRotate def = (IRotate) block;
		rotatingTopShaft = Optional.empty();
		rotatingBottomShaft = Optional.empty();

		for (Direction d : Iterate.directionsInAxis(axis)) {
			if (!def.hasShaftTowards(tile.getLevel(), tile.getBlockPos(), blockState, d))
				continue;
			RotatingData data = setup(getRotatingMaterial().getModel(AllBlockPartials.SHAFT_HALF, blockState, d)
				.createInstance());
			if (d.getAxisDirection() == AxisDirection.POSITIVE)
				rotatingTopShaft = Optional.of(data);
			else
				rotatingBottomShaft = Optional.of(data);
		}
	}
	
	@Override
	protected Instancer<RotatingData> getCogModel() {
		BlockState referenceState = tile.getBlockState();
		Direction facing =
			Direction.fromAxisAndDirection(referenceState.getValue(BlockStateProperties.AXIS), AxisDirection.POSITIVE);
		PartialModel partial = large ? AllModBlockPartials.LARGE_SHAFTLESS_OAK_COGWHEEL : AllModBlockPartials.PARTIAL_SHAFTLESS_OAK_COGWHEEL;

		return getRotatingMaterial().getModel(partial, referenceState, facing, () -> {
			PoseStack poseStack = new PoseStack();
			TransformStack.cast(poseStack)
				.centre()
				.rotateToFace(facing)
				.multiply(Vector3f.XN.rotationDegrees(90))
				.unCentre();
			return poseStack;
		});
	}

}
