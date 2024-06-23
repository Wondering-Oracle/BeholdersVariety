package com.silicateseer.beholdersvariety.block.cropblock;

import com.silicateseer.beholdersvariety.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class FerrelCropBlock extends OreCropBlock {

    public FerrelCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.FERREL_SEEDS;
    }
}
