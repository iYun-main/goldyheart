package net.iyun.goldyheart.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.iyun.goldyheart.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;


public class ModLootTableModifiers {
        private static final Identifier GRASS_ID =
                new Identifier("minecraft","blocks/grass");

    public static void modifyLootTables() {

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
         if(GRASS_ID.equals(id))
          {
             LootPool.Builder poolBuilder = LootPool.builder()
             .rolls(ConstantLootNumberProvider.create(1))
             .with(ItemEntry.builder(ModItems.GRAPESEEDS))
             .with(ItemEntry.builder(ModItems.CHILLISEEDS))
             .with(ItemEntry.builder(ModItems.LETTUCESEEDS))
             .with(ItemEntry.builder(ModItems.BELLPEPPERSEEDS))
             .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.01f, 0.5f)).build());
         tableBuilder.pool(poolBuilder.build());
         }


        });
    }
}
