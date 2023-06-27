package com.github.greenshankminecraft.automaticfactoriesmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup AUTOMATICFACTORIES_MATERIALS = new ItemGroup("automaticfactoriesmod_materialstab"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEEL_INGOT.get());
        }
    };
}
