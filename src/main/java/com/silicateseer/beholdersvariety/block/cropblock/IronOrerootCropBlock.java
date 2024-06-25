package com.silicateseer.beholdersvariety.block.cropblock;

import com.silicateseer.beholdersvariety.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class IronOrerootCropBlock extends OreCropBlock{
    public IronOrerootCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.IRON_OREROOT_SEEDS;
    }
}
