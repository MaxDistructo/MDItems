package com.github.MaxDistructo.MDItems.items;

import net.minecraft.item.Item;

import com.github.MaxDistructo.MDItems.items.dragon.dragonAxe;
import com.github.MaxDistructo.MDItems.items.dragon.dragonHoe;
import com.github.MaxDistructo.MDItems.items.dragon.dragonPick;
import com.github.MaxDistructo.MDItems.items.dragon.dragonShovel;
import com.github.MaxDistructo.MDItems.items.dragon.dragonSword;
import com.github.MaxDistructo.MDItems.items.wither.witherSword;
import com.github.MaxDistructo.MDItems.materials.ToolMaterials;

import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
    public static Item dragonSword;
    public static Item witherSword;
    public static Item dragonPick;
    public static Item dragonAxe;
    public static Item dragonShovel;
    public static Item dragonHoe;
    public static void init(){
        
    
    GameRegistry.registerItem(dragonSword = new dragonSword("dragonSword", ToolMaterials.dragon),"dragonSword");
    GameRegistry.registerItem(witherSword = new witherSword("witherSword", ToolMaterials.wither),"witherSword");
    GameRegistry.registerItem(dragonPick = new dragonPick("dragonPick", ToolMaterials.dragon),"dragonPick");
    GameRegistry.registerItem(dragonAxe = new dragonAxe("dragonAxe", ToolMaterials.dragon),"dragonAxe");
    GameRegistry.registerItem(dragonShovel = new dragonShovel("dragonShovel", ToolMaterials.dragon), "dragonShovel");
    GameRegistry.registerItem(dragonHoe = new dragonHoe("dragonHoe", ToolMaterials.dragon),"dragonHoe");
}

}

