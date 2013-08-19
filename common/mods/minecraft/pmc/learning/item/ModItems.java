package mods.minecraft.pmc.learning.item;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;

import net.minecraftforge.common.EnumHelper;

import mods.minecraft.pmc.learning.lib.ItemIDs;
import mods.minecraft.pmc.learning.lib.Strings;

public class ModItems
{

    //Items
    public static Item helmetWooden;
    public static Item chestplateWooden;
    public static Item leggingsWooden;
    public static Item bootsWooden;
    
    
    //Armor Enums
    public static EnumArmorMaterial WOODEN_ARMOR = EnumHelper.addArmorMaterial("WOOD", 4, new int[] {1, 1, 1, 1}, 20);
    
    public static void init()
    {
        helmetWooden = new ArmorBase(ItemIDs.WOODEN_HELMET, WOODEN_ARMOR, 0, 0).setUnlocalizedName(Strings.WOODEN_HELMET);
        chestplateWooden = new ArmorBase(ItemIDs.WOODEN_CHEST, WOODEN_ARMOR, 0, 1).setUnlocalizedName(Strings.WOODEN_CHEST);
        leggingsWooden = new ArmorBase(ItemIDs.WOODEN_LEGGINGS, WOODEN_ARMOR, 0, 2).setUnlocalizedName(Strings.WOODEN_LEGGINGS);
        bootsWooden = new ArmorBase(ItemIDs.WOODEN_BOOTS, WOODEN_ARMOR, 0, 3).setUnlocalizedName(Strings.WOODEN_BOOTS);
    }
    
}
