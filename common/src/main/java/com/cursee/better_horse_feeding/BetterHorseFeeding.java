package com.cursee.better_horse_feeding;

import net.minecraft.resources.ResourceLocation;

public class BetterHorseFeeding {

    public static void init() {}

    public static ResourceLocation identifier(String value) {
        return new ResourceLocation(Constants.MOD_ID, value);
    }
}