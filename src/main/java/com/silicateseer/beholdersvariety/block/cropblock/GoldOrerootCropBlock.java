package com.silicateseer.beholdersvariety.block.cropblock;

import com.silicateseer.beholdersvariety.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class GoldOrerootCropBlock extends OreCropBlock{
    public GoldOrerootCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GOLD_OREROOT_SEEDS;
    }
}
