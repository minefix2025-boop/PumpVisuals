package com.example.pumpkinvisuals.commands;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

@Mod.EventBusSubscriber
public class HiddenXRayCommand {
    public static LiteralArgumentBuilder<CommandSource> register() {
        return Commands.literal("pumpkinxray")
            .executes(ctx -> {
                CommandSource source = ctx.getSource();
                source.sendFeedback(new StringTextComponent("Pumpkin X-Ray cheat toggle: ON (simulated)"), true);
                return 1;
            });
    }
}
