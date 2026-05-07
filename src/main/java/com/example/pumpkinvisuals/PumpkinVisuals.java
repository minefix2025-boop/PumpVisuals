package com.minefix.pumpvisuals;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("pumpvisuals")
public class PumpVisuals {
    public static final String MOD_ID = "pumpvisuals";
    private static final Logger LOGGER = LogManager.getLogger();

    public PumpVisuals() {
        // Регистрация мода в шине событий Forge
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("PumpVisuals загружен!");
    }

    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event) {
        // Регистрация нашей команды /xray
        XRayCommand.register(event.getDispatcher());
    }
}
