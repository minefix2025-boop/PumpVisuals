package com.example.pumpkinvisuals.helpers;

import net.minecraft.util.ResourceLocation;

public class TextureHelper {
    public static ResourceLocation locationOf(String path) {
        return new ResourceLocation("pumpkinvisuals", path);
    }
}
