package com.example.pumpkinvisuals;

import com.example.pumpkinvisuals.commands.HiddenXRayCommand; // Импортируем твою команду
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("pumpkinvisuals")
public class PumpkinVisuals {
    public PumpkinVisuals() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event) {
        // Вызываем регистрацию именно из твоего файла HiddenXRayCommand
        HiddenXRayCommand.register(event.getDispatcher());
    }
}
