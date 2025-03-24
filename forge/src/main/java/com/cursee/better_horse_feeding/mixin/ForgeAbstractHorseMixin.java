package com.cursee.better_horse_feeding.mixin;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(AbstractHorse.class)
public class ForgeAbstractHorseMixin {

    @Inject(method = "handleEating", at = @At("HEAD"))
    private void handleEating$inject(Player pPlayer, ItemStack pStack, CallbackInfoReturnable<Boolean> cir) {
        AbstractHorse instance = (AbstractHorse) (Object) this;
        FoodProperties foodProperties = pStack.get(DataComponents.FOOD);
        if (foodProperties == null) return;
        List<FoodProperties.PossibleEffect> foodEffects = foodProperties.effects();
        if (!foodEffects.isEmpty()) foodEffects.forEach(possibleEffect -> instance.addEffect(possibleEffect.effect()));
    }
}
