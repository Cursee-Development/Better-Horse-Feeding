package com.cursee.better_horse_feeding;

import com.cursee.better_horse_feeding.core.registry.RegistryForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class BetterHorseFeedingForge {

    public static IEventBus EVENT_BUS = null;
    
    public BetterHorseFeedingForge(FMLJavaModLoadingContext context) {
        BetterHorseFeeding.init();
        BetterHorseFeedingForge.EVENT_BUS = context.getModEventBus();
        RegistryForge.register(BetterHorseFeedingForge.EVENT_BUS);
    }
}