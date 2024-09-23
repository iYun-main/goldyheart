package net.iyun.goldyheart.world.feature.tree;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;


public class OldSaplingGenerator {
public static final SaplingGenerator OLD_T = new SaplingGenerator(Goldy_Heart.MOD_ID + ":old_t",
        Optional.empty(), Optional.of(ModConfiguredFeatures.OLDA_KEY), Optional.empty());

    }


