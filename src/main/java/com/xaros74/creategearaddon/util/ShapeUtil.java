package com.xaros74.creategearaddon.util;

import com.simibubi.create.AllShapes.Builder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public interface ShapeUtil {

	default Builder shape(VoxelShape shape) {
		return new Builder(shape);
	}

	default VoxelShape cuboid(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Block.box(x1, y1, z1, x2, y2, z2);
	}

}
