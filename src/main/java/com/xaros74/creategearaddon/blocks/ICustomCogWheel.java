package com.xaros74.creategearaddon.blocks;

import com.jozufozu.flywheel.core.PartialModel;
import com.xaros74.creategearaddon.index.ECPartials;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public interface ICustomCogWheel {
	static PartialModel getPartialModelType(BlockState state) {
        return getPartialModelType(state.getBlock());
    }
    static PartialModel getPartialModelType(Block block) {
        if (!(block instanceof ICustomCogWheel cogWheel))
            return null;
        return cogWheel.getPartialModelType();
    }

    default PartialModel getPartialModelType() {
        return ECPartials.LARGE_ACACIA_COGWHEEL;
    }
}
