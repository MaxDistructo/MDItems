package com.github.MaxDistructo.MDItems.blocks;

import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class Block {
    
    public static Block dragonObsidian;
    public static Block witherQuartz;
    
    public static void init(){
        GameRegistry.registerBlock(dragonObsidian = new MDItems_dragonObsidian("dragonObsidian", Material.iron), "dragonObsidian");
        GameRegistry.registerBlock(witherQuartz = new witherQuartz("witherQuartz", Material.iron),"witherQuartz");
        
    }
}
