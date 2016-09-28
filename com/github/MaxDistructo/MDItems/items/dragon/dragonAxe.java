package com.github.MaxDistructo.MDItems.items.dragon;

import net.minecraft.item.ItemAxe;
import com.github.MaxDistructo.MDItems.Main;

public class dragonAxe extends ItemAxe{

    protected dragonAxe(String unlocalizedName, ToolMaterial material){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
    }
}
