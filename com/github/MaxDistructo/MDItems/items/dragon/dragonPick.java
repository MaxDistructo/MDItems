package com.github.MaxDistructo.MDItems.items.dragon;

import net.minecraft.item.ItemPickaxe;

import com.github.MaxDistructo.MDItems.Main;

public class dragonPick extends ItemPickaxe{

    protected dragonPick(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
    }
}
