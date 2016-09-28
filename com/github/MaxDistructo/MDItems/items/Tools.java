package com.github.MaxDistructo.MDItems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Tools{
    
    public static Item netherstarPick;
    public static Item dragoneggPick;
    public static Item netherstarAxe;
    public static Item dragoneggAxe;
    public static Item netherstarShovel;
    public static Item dragoneggShovel;
    public static Item netherstarHoe;
    public static Item dragoneggHoe;
    
    public static final void init(){
        
        netherstarPick = new Item().setUnlocalizedName("netherstarPick").setCreativeTab(CreativeTabs.tabTools);
        dragoneggPick = new Item().setUnlocalizedName("dragoneggPick").setCreativeTab(CreativeTabs.tabTools);
        netherstarAxe = new Item().setUnlocalizedName("netherstarAxe").setCreativeTab(CreativeTabs.tabTools);
        dragoneggAxe = new Item().setUnlocalizedName("dragoneggAxe").setCreativeTab(CreativeTabs.tabTools);
        netherstarShovel = new Item().setUnlocalizedName("netherstarShovel").setCreativeTab(CreativeTabs.tabTools);
        dragoneggShovel = new Item().setUnlocalizedName("dragoneggShovel").setCreativeTab(CreativeTabs.tabTools);
        netherstarHoe = new Item().setUnlocalizedName("netherstarHoe").setCreativeTab(CreativeTabs.tabTools);
        dragoneggHoe = new Item().setUnlocalizedName("dragoneggHoe").setCreativeTab(CreativeTabs.tabTools);
        
        GameRegistry.registerItem(netherstarPick,"netherstarPick");
        GameRegistry.registerItem(dragoneggPick,"dragoneggPick");
        GameRegistry.registerItem(netherstarAxe,"netherstarAxe");
        GameRegistry.registerItem(dragoneggAxe,"dragoneggAxe");
        GameRegistry.registerItem(netherstarShovel,"netherstarShovel");
        GameRegistry.registerItem(dragoneggShovel,"dragoneggShovel");
        GameRegistry.registerItem(netherstarHoe,"netherstarHoe");
        GameRegistry.registerItem(dragoneggHoe,"dragoneggHoe");
    }
}