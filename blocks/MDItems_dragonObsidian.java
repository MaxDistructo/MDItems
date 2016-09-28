package com.github.MaxDistructo.MDItems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MDItems_dragonObsidian extends Block{

    protected MDItems_dragonObsidian(String dragonObsidian, Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setBlockName(dragonObsidian);
        this.setBlockTextureName("minecraft:obsidian");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(50.0F);
        this.setResistance(4000.0F);
        this.setHarvestLevel("pickaxe",7);
        this.setStepSound(soundTypeMetal);
    }
}
