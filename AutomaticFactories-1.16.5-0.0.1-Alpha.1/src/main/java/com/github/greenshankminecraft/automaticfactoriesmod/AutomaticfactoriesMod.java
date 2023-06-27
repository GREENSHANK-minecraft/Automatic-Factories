package com.github.greenshankminecraft.automaticfactoriesmod;

import com.github.greenshankminecraft.automaticfactoriesmod.block.ModBlocks;
import com.github.greenshankminecraft.automaticfactoriesmod.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AutomaticfactoriesMod.MOD_ID)
public class AutomaticfactoriesMod {
    public static final String MOD_ID = "automaticfactoriesmod";

    public AutomaticfactoriesMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
    }
}
