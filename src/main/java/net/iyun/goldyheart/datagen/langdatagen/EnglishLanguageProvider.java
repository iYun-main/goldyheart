package net.iyun.goldyheart.datagen.langdatagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.iyun.goldyheart.block.ModBlocks;
import net.iyun.goldyheart.item.ModItems;

public class EnglishLanguageProvider extends FabricLanguageProvider {
    public EnglishLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.WEATHERED_LEAVES,"Bog Leaves");
        translationBuilder.add(ModItems.WHISKEY,"Whiskey");
    }

    @Override
    public String getName() {
        return "Adding Names to the Blocks and Items";
    }
}