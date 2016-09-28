package com.github.MaxDistructo.MDItems.items.wither;

import net.minecraft.item.ItemAxe;

import com.github.MaxDistructo.MDItems.Main;

public class witherAxe extends ItemAxe{

    protected witherAxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
        
        // TODO Auto-generated constructor stub
    }
    
}
