package mods.minecraft.pmc.learning.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.minecraft.pmc.learning.TheLearningMod;
import mods.minecraft.pmc.learning.lib.Reference;

public class ArmorBase extends ItemArmor
{

    public ArmorBase(int id, EnumArmorMaterial enumArmorMaterial, int par3, int par4)
    {
        super(id, enumArmorMaterial, par3, par4);
        this.setMaxStackSize(1)
            .setCreativeTab(TheLearningMod.tabLearning);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
        return null;
    }
    
}
