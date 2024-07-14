package net.iyun.goldyheart.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;


public class CoffeeItem extends Item {
    public CoffeeItem(Settings settings) {
        super(settings);
    }


    private static final int MAX_USE_TIME = 30;

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 30;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

}
