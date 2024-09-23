package net.iyun.goldyheart.world.feature.tree;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Optional;


public class AncientSaplingGenerator  {
public static final SaplingGenerator ANCIENT_T = new SaplingGenerator(Goldy_Heart.MOD_ID + ":ancient_t",
        Optional.empty(), Optional.of(ModConfiguredFeatures.ANC_KEY), Optional.empty());

    }


