package com.silicateseer.beholdersvariety.block.cropblock;

import com.silicateseer.beholdersvariety.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class CopperOrerootCropBlock extends OreCropBlock{
    public CopperOrerootCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.COPPER_OREROOT_SEEDS;
    }
}
