package com.minefix.pumpvisuals;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.StringTextComponent;

public class XRayCommand {
    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("xray")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().asPlayer();
                
                // Простая логика X-Ray: даем ночное зрение на максимум
                if (player.getActivePotionEffect(Effects.NIGHT_VISION) != null) {
                    player.removePotionEffect(Effects.NIGHT_VISION);
                    player.sendMessage(new StringTextComponent("§6[PumpVisuals]§r X-Ray выключен"), player.getUniqueID());
                } else {
                    player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 99999, 0, false, false));
                    player.sendMessage(new StringTextComponent("§6[PumpVisuals]§r X-Ray включен!"), player.getUniqueID());
                }
                return 1;
            })
        );
    }
}
