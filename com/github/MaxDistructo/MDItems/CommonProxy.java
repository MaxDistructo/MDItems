package com.github.MaxDistructo.MDItems;

import com.github.MaxDistructo.MDItems.items.Swords;
import com.github.MaxDistructo.MDItems.items.Tools;
import com.github.MaxDistructo.MDItems.items.crafting_items;
import com.github.MaxDistructo.MDItems.blocks.Block;
import com.github.MaxDistructo.MDItems.crafting.Crafting;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        Swords.init();
        Tools.init();
        crafting_items.init();
        Block.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
        Crafting.init();
}

}
