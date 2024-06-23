package com.silicateseer.beholdersvariety.block.cropblock;

import com.silicateseer.beholdersvariety.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class GoldendropCropBlock extends OreCropBlock{
    public GoldendropCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GOLDENDROP_SEEDS;
    }
}
