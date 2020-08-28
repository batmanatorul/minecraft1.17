package com.batmanatorul.MinecraftCaveUpdate.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SilverBlock extends Block {

    public SilverBlock() {
        super(Properties.create(Material.IRON)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(2)
        .sound(SoundType.METAL)
        .hardnessAndResistance(5.0f,6.0f)
        .setRequiresTool());
    }
}
