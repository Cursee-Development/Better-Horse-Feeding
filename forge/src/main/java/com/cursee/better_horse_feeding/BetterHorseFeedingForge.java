package com.cursee.better_horse_feeding;

import com.cursee.better_horse_feeding.core.registry.RegistryForge;
import com.cursee.monolib.core.sailing.Sailing;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class BetterHorseFeedingForge {

    public static IEventBus EVENT_BUS = null;
    
    public BetterHorseFeedingForge() {
        BetterHorseFeeding.init();
        Sailing.register(Constants.MOD_ID, Constants.MOD_NAME, Constants.MOD_VERSION, Constants.MOD_PUBLISHER, Constants.MOD_URL);
        BetterHorseFeedingForge.EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryForge.register(BetterHorseFeedingForge.EVENT_BUS);
    }
}