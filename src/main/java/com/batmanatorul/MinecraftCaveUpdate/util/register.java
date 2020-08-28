package com.batmanatorul.MinecraftCaveUpdate.util;


import com.batmanatorul.MinecraftCaveUpdate.MinecraftCaveUpdate;
import com.batmanatorul.MinecraftCaveUpdate.armor.MiningHelmet;
import com.batmanatorul.MinecraftCaveUpdate.armor.SilverArmorMaterial;
import com.batmanatorul.MinecraftCaveUpdate.blocks.*;
import com.batmanatorul.MinecraftCaveUpdate.items.silver_ingot;
import com.batmanatorul.MinecraftCaveUpdate.items.silver_nugget;
import com.batmanatorul.MinecraftCaveUpdate.tools.SilverItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class register {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftCaveUpdate.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftCaveUpdate.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Blocks
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", SilverOre::new);
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> MALACHITE = BLOCKS.register("malachite", Malachite::new);
    public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", Marble::new);
    public static final RegistryObject<Block> INVISIBLE = BLOCKS.register("invisible_block", InvisibleLightBlock::new);

    //Block Items
    public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () ->
            new BlockItem(SILVER_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () ->
            new BlockItem(SILVER_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MALACHITE_ITEM = ITEMS.register("malachite", () ->
            new BlockItem(MALACHITE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MARBLE_ITEM = ITEMS.register("marble", () ->
            new BlockItem(MARBLE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> INVISIBLE_ITEM = ITEMS.register("invisible_block", () ->
            new BlockItem(INVISIBLE.get(), new Item.Properties().group(ItemGroup.TOOLS)));

    //Items
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", silver_ingot::new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", silver_nugget::new);

    //Tools
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () ->
            new SwordItem(SilverItemTier.Silver, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(SilverItemTier.Silver, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () ->
            new AxeItem(SilverItemTier.Silver, 6, -3.1F, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () ->
            new ShovelItem(SilverItemTier.Silver, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () ->
            new HoeItem(SilverItemTier.Silver, -2, -2.2F, new Item.Properties().group(ItemGroup.TOOLS)));

    //Armor
    public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet", () ->
            new ArmorItem(SilverArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () ->
            new ArmorItem(SilverArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> SILVER_LEGGINS = ITEMS.register("silver_leggins", () ->
            new ArmorItem(SilverArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots", () ->
            new ArmorItem(SilverArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> MINING_HELMET = ITEMS.register("mining_helmet", () ->
            new ArmorItem(MiningHelmet.MINING, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));





}
