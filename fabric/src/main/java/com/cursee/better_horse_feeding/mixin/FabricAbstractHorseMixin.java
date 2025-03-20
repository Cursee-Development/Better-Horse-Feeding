package com.cursee.better_horse_feeding.mixin;

import com.mojang.datafixers.util.Pair;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(AbstractHorse.class)
public class FabricAbstractHorseMixin {

    @Inject(method = "handleEating", at = @At("HEAD"))
    private void handleEating$inject(Player pPlayer, ItemStack pStack, CallbackInfoReturnable<Boolean> cir) {
        AbstractHorse instance = (AbstractHorse) (Object) this;
        Item item = pStack.getItem();
        FoodProperties foodProperties = item.getFoodProperties();
        if (foodProperties == null) return;
        List<Pair<MobEffectInstance, Float>> foodEffects = foodProperties.getEffects();
        if (!foodEffects.isEmpty()) item.getFoodProperties().getEffects().forEach(mobEffectFloatPair -> {
            MobEffectInstance mobEffect = mobEffectFloatPair.getFirst();
            instance.addEffect(mobEffect);
        });
//        AbstractHorse instance = (AbstractHorse) (Object) this;
//        Item item = pStack.getItem();
//        if (item == Items.ENCHANTED_GOLDEN_APPLE) {
//            instance.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1));
//            instance.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0));
//            instance.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0));
//            instance.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3));
//        }
//        if (item == Items.GOLDEN_APPLE) {
//            instance.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1));
//            instance.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0));
//        }
    }
}
