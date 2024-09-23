package net.iyun.goldyheart.world.feature.tree;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;


public class WeatheredSaplingGenerator {
public static final SaplingGenerator WEATH_T = new SaplingGenerator(Goldy_Heart.MOD_ID + ":weath_t",
        Optional.empty(), Optional.of(ModConfiguredFeatures.WEATH_KEY), Optional.empty());

    }


