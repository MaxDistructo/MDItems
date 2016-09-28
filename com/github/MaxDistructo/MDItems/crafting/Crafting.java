package com.github.MaxDistructo.MDItems.crafting;

import net.minecraft.item.ItemStack;

import com.github.MaxDistructo.MDItems.blocks.*;
import com.github.MaxDistructo.MDItems.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(Block.dragonObsidian)," # ","## ","###",'#', crafting_items.dragon_essence);
        GameRegistry.addRecipe(new ItemStack(Swords.netherstarSword)," # "," # "," S ",'#', crafting_items.nether_essence);
        
    }
}
