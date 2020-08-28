package com.batmanatorul.MinecraftCaveUpdate.world.gen;

import com.batmanatorul.MinecraftCaveUpdate.MinecraftCaveUpdate;
import com.batmanatorul.MinecraftCaveUpdate.util.register;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MinecraftCaveUpdate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGen {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome :ForgeRegistries.BIOMES) {

            genOre(biome, 10, 10, 5, 55, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    register.MARBLE.get().getDefaultState(), 20);
            genOre(biome, 10, 10, 5, 55, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    register.MALACHITE.get().getDefaultState(), 20);
            genOre(biome, 10, 5, 5, 45, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    register.SILVER_ORE.get().getDefaultState(), 8);
        }
        }


        private static void genOre(Biome biome, int Count, int BottomOffset, int TopOffset, int Max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
         CountRangeConfig range = new CountRangeConfig(Count, BottomOffset, TopOffset, Max);
            OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
            ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));

        }
    }
