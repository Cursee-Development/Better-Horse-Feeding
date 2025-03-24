package com.cursee.better_horse_feeding;

import com.cursee.better_horse_feeding.core.registry.RegistryNeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class BetterHorseFeedingNeoForge {

    public static IEventBus EVENT_BUS = null;

    public BetterHorseFeedingNeoForge(IEventBus modEventBus) {
        BetterHorseFeeding.init();
        BetterHorseFeedingNeoForge.EVENT_BUS = modEventBus;
        RegistryNeoForge.register(BetterHorseFeedingNeoForge.EVENT_BUS);
    }
}