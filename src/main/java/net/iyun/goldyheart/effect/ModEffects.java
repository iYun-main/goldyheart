package net.iyun.goldyheart.effect;

import net.iyun.goldyheart.Goldy_Heart;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEffects {
    public static StatusEffect VENOM;


    public static StatusEffect registerStatusEffect (String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Goldy_Heart.MOD_ID, name),
                new VenomEffect(StatusEffectCategory.HARMFUL, 0x98D982));
    }

    public static void registerEffects(){
        VENOM = registerStatusEffect("venom");
    }
}
