package mods.minecraft.pmc.learning.core.handler;

import cpw.mods.fml.common.registry.LanguageRegistry;

import mods.minecraft.pmc.learning.core.util.LocalizationUtil;
import mods.minecraft.pmc.learning.lib.Localizations;

public class LocalizationHandler
{

    public static void loadLanguages()
    {
        
        // For every file specified in the Localization library class, load them into the Language Registry
        for (String localizationFile : Localizations.localeFiles)
        {
            LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationUtil.getLocaleFromFileName(localizationFile), LocalizationUtil.isXMLLanguageFile(localizationFile));
        }
        
    }   
    
}
