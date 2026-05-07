package com.example.pumpkinvisuals.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ClientEventHandler {
    // Placeholder for future client-side events (e.g., HUD overlay)
    @SubscribeEvent
    public static void onRenderOverlay(RenderGameOverlayEvent.Post event) {
        // Intentionally left minimal for starter mod
    }
}
