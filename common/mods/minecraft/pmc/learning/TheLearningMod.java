package mods.minecraft.pmc.learning;

import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import mods.minecraft.pmc.learning.core.handler.LocalizationHandler;
import mods.minecraft.pmc.learning.core.proxy.CommonProxy;
import mods.minecraft.pmc.learning.creativetabs.CreativeTabLearning;
import mods.minecraft.pmc.learning.item.ModItems;
import mods.minecraft.pmc.learning.lib.Reference;
import mods.minecraft.pmc.learning.recipe.ModRecipes;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TheLearningMod
{
    @Instance(Reference.MOD_ID)
    public static TheLearningMod instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static CreativeTabs tabLearning = new CreativeTabLearning(Reference.MOD_ID);
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
        //Load Localizations
        LocalizationHandler.loadLanguages();
        
        //Initizialize Mod Items
        ModItems.init();
        
        //Initialize Mod recipes
        ModRecipes.init();
        
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