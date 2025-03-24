package com.cursee.better_horse_feeding;

import net.fabricmc.api.ClientModInitializer;

public class BetterHorseFeedingClientFabric implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        BetterHorseFeedingClient.init();
    }
}
