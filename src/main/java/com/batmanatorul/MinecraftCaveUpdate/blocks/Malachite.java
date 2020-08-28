package com.batmanatorul.MinecraftCaveUpdate.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Malachite extends OreBlock {

    public Malachite() {
        super(Properties.create(Material.ROCK)
        .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(0)
                .hardnessAndResistance(2.0f,5.0f)
                .setRequiresTool()
        );
    }
}
