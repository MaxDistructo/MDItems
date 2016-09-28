package com.github.MaxDistructo.MDItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=MDItems.MODID, name= MDItems.MODNAME, version = MDItems.VERSION)
public class Main {
    public static final String MODID = "MDItems";
    public static final String MODNAME = "MD's Items";
    public static final String VERSION = "Beta 0.1";
    
@Instance public static MDItems instance = new MDItems();

@SidedProxy(clientSide="com.github.MaxDistructo.MDItems.ClientProxy", serverSide="com.github.MaxDistructo.MDItems.ServerProxy")
public static CommonProxy proxy;   
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
         proxy.preInit(e);       
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
            proxy.init(e);      
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
                proxy.postInit(e);  
    }
}
