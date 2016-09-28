package com.github.MaxDistructo.MDItems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class crafting_items {
    
    public static Item dragon_essence;
    public static Item raw_dragon_essence;
    public static Item nether_essence;
    public static Item raw_nether_essence;
    
    public static void init(){
        dragon_essence = new Item().setUnlocalizedName("dragon_essence").setCreativeTab(CreativeTabs.tabMisc);
        raw_dragon_essence = new Item().setUnlocalizedName("raw_dragon_essence").setCreativeTab(CreativeTabs.tabMisc);
        nether_essence= new Item().setUnlocalizedName("nether_essence").setCreativeTab(CreativeTabs.tabMisc);
        raw_nether_essence = new Item().setUnlocalizedName("raw_nether_essence").setCreativeTab(CreativeTabs.tabMisc);
        
        GameRegistry.registerItem(dragon_essence,"dragon_essence");
        GameRegistry.registerItem(raw_dragon_essence,"raw_dragon_essence");
        GameRegistry.registerItem(nether_essence,"nether_essence");
        GameRegistry.registerItem(raw_nether_essence,"raw_nether_essence");
        
    }
    
}
