package mods.minecraft.pmc.learning.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabLearning extends CreativeTabs
{
    public CreativeTabLearning(String label)
    {
        super(label);
    }

    public CreativeTabLearning(int par1, String par2str)
    {
        super(par1, par2str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    //Give item id of item to display as tab icon
    public int getTabIconItemIndex()
    {
        return Item.book.itemID;
    }
}
