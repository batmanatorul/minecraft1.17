package com.batmanatorul.MinecraftCaveUpdate.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Marble extends OreBlock {

    public Marble() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f,5.0f)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .setRequiresTool()
        );
    }
}
