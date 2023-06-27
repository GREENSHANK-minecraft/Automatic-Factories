package com.github.greenshankminecraft.automaticfactoriesmod.item;

import com.github.greenshankminecraft.automaticfactoriesmod.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.github.greenshankminecraft.automaticfactoriesmod.AutomaticfactoriesMod.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()
            .tab(ModItemGroup.AUTOMATICFACTORIES_MATERIALS)));
    public static final RegistryObject<Item> STEEL_POWDER = ITEMS.register("steel_powder", () -> new Item(new Item.Properties()
            .tab(ModItemGroup.AUTOMATICFACTORIES_MATERIALS)));
    public  static  final RegistryObject<Item> STEEL_BLOCK = ITEMS.register("steel_block",() -> new BlockItem(ModBlocks.STEEL_BLOCK.get(), new Item.Properties()
            .tab(ModItemGroup.AUTOMATICFACTORIES_MATERIALS)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}