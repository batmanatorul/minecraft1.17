package com.batmanatorul.MinecraftCaveUpdate.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class InvisibleLightBlock extends Block {

    public InvisibleLightBlock() { super(Block.Properties.create(Material.AIR).setLightLevel(value -> 11).doesNotBlockMovement().notSolid().noDrops()); }

}
