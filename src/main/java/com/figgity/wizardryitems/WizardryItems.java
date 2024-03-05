package com.figgity.wizardryitems;

import com.figgity.wizardryitems.proxy.CommonProxy;
import com.figgity.wizardryitems.util.Refrence;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION)
public class WizardryItems {
    @Instance
    public static WizardryItems instance;

    @SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void Init(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void PostInit(FMLPreInitializationEvent event){

    }
}