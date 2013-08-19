package mods.minecraft.pmc.learning;

import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import mods.minecraft.pmc.learning.creativetabs.CreativeTabLearning;
import mods.minecraft.pmc.learning.lib.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TheLearningMod
{
    @Instance(Reference.MOD_ID)
    public static TheLearningMod instance;
    
    public static CreativeTabs tabLearning = new CreativeTabLearning(Reference.MOD_ID);
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }
    
    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event)
    {
        
    }
    
}