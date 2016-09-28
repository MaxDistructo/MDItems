package com.github.MaxDistructo.MDItems.items.dragon;

import net.minecraft.item.ItemHoe;
import com.github.MaxDistructo.MDItems.Main;

public class dragonHoe extends ItemHoe{

    public dragonHoe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
        // TODO Auto-generated constructor stub
    }
}
