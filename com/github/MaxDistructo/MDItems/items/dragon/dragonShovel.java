package com.github.MaxDistructo.MDItems.items.dragon;

import net.minecraft.item.ItemSpade;

import com.github.MaxDistructo.MDItems.Main;

public class dragonShovel extends ItemSpade{

    protected dragonShovel(String unlocalizedName, ToolMaterial material){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
    }
        // TODO Auto-generated constructor stub
    }

