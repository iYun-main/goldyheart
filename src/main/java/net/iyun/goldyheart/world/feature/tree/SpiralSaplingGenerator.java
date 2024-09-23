package net.iyun.goldyheart.world.feature.tree;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;


public class SpiralSaplingGenerator {
public static final SaplingGenerator SPIR_T = new SaplingGenerator(Goldy_Heart.MOD_ID + ":spir_t",
        Optional.empty(), Optional.of(ModConfiguredFeatures.SPIR_KEY), Optional.empty());

    }


