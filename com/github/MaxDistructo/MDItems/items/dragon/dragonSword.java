package com.github.MaxDistructo.MDItems.items.dragon;

import net.minecraft.item.ItemSword;
import com.github.MaxDistructo.MDItems.Main;

public class dragonSword extends ItemSword{

    public dragonSword(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
    }
 
}
