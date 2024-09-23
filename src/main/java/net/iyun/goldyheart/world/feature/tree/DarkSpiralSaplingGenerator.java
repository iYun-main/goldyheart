package net.iyun.goldyheart.world.feature.tree;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;


public class DarkSpiralSaplingGenerator {
public static final SaplingGenerator DSPIR_T = new SaplingGenerator(Goldy_Heart.MOD_ID + ":dspir_t",
        Optional.empty(), Optional.of(ModConfiguredFeatures.DARK_KEY), Optional.empty());

    }


