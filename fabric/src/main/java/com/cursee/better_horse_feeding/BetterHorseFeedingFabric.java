package com.cursee.better_horse_feeding;

import com.cursee.better_horse_feeding.core.registry.RegistryFabric;
import com.cursee.monolib.core.sailing.Sailing;
import net.fabricmc.api.ModInitializer;

public class BetterHorseFeedingFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        BetterHorseFeeding.init();
        Sailing.register(Constants.MOD_ID, Constants.MOD_NAME, Constants.MOD_VERSION, Constants.MOD_PUBLISHER, Constants.MOD_URL);
        RegistryFabric.register();
    }
}
