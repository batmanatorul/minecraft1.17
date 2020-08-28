package com.batmanatorul.MinecraftCaveUpdate.events;

import com.batmanatorul.MinecraftCaveUpdate.MinecraftCaveUpdate;
import com.batmanatorul.MinecraftCaveUpdate.util.register;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.BlockingQueue;

@Mod.EventBusSubscriber(modid = MinecraftCaveUpdate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class events {

    @SubscribeEvent
    public static void Light(LivingEvent.LivingUpdateEvent event){
        LivingEntity player = event.getEntityLiving();
        World world = player.getEntityWorld();
        if ((((player instanceof PlayerEntity) ? ((PlayerEntity) player).inventory.armorInventory.get(3) : ItemStack.EMPTY)
                .getItem() == new
                ItemStack(register.MINING_HELMET.get().getItem(), 1).getItem())) {
        world.setBlockState(player.getPosition().add(0,1,0), register.INVISIBLE.get().getDefaultState());
    }
    if (world.getBlockState(player.getPosition().add(0,1,0)) == register.INVISIBLE.get().getDefaultState()) {
        world.setBlockState(player.getPosition().add(0,1,0), Blocks.AIR.getDefaultState());
    }
        if (world.getBlockState(player.getPosition().add(1,0,0)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,0,0), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,0,0)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,0,0), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(0,0,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(0,0,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(0,0,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(0,0,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,0,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,0,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(1,0,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,0,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(1,0,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,0,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,0,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,0,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(1,1,0)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,1,0), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,1,0)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,1,0), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(0,1,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(0,1,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(0,1,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(0,1,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,1,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,1,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(1,1,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,1,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(1,1,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,1,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,1,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,1,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(1,-1,0)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,-1,0), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,-1,0)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,-1,0), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(0,-1,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(0,-1,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(0,-1,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(0,-1,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,-1,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,-1,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(1,-1,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,-1,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(1,-1,1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(1,-1,1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(-1,-1,-1)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(-1,-1,-1), Blocks.AIR.getDefaultState());
        }
        if (world.getBlockState(player.getPosition().add(0,-1,0)) == register.INVISIBLE.get().getDefaultState()) {
            world.setBlockState(player.getPosition().add(0,-1,0), Blocks.AIR.getDefaultState());
        }


}

}
