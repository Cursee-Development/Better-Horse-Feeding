package com.cursee.better_horse_feeding;

import com.cursee.better_horse_feeding.core.registry.RegistryFabric;
import net.fabricmc.api.ModInitializer;

public class BetterHorseFeedingFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        BetterHorseFeeding.init();
        RegistryFabric.register();
    }
}
