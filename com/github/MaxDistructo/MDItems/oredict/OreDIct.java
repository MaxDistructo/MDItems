package com.github.MaxDistructo.MDItems.oredict;
import net.minecraftforge.oredict.OreDictionary;
import com.github.MaxDistructo.MDItems.items.*;
public class OreDIct {
    public static void init(){
    OreDictionary.registerOre("dragonEssence", crafting_items.dragon_essence);
    OreDictionary.registerOre("starEssence", crafting_items.nether_essence);
    OreDictionary.registerOre("rawstarEssence", crafting_items.raw_nether_essence);
    OreDictionary.registerOre("rawdragonEssence", crafting_items.raw_dragon_essence);
}

}
