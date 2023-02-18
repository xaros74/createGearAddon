package com.xaros74.creategearaddon.tiles;

import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.MaterialManager;
import com.jozufozu.flywheel.core.PartialModel;
import com.jozufozu.flywheel.util.transform.TransformStack;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.base.KineticTileEntityRenderer;
import com.simibubi.create.content.contraptions.base.flwdata.RotatingData;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileInstance;
import com.simibubi.create.content.contraptions.relays.elementary.ICogWheel;
import com.xaros74.creategearaddon.blocks.ICustomCogWheel;

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
    protected Instancer<RotatingData> getModel() {
        PartialModel model = ICustomCogWheel.getPartialModelType(blockState.getBlock());
    if (model == null) model = AllBlockPartials.SHAFTLESS_LARGE_COGWHEEL;
    
    if (!ICogWheel.isLargeCog(blockEntity.getBlockState()))
		return super.getModel();
    	
    Axis axis = KineticTileEntityRenderer.getRotationAxisOf(blockEntity);
	Direction facing = Direction.fromAxisAndDirection(axis, AxisDirection.POSITIVE);
	return getRotatingMaterial().getModel(model, blockState, facing,
		() -> this.rotateToAxis(axis));
    }

}
