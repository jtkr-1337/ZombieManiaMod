package ru.jtkr.zmania.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.jtkr.zmania.items.ModItems;

public class CommonProxy{
    public void preInit(FMLPreInitializationEvent event) {
            ModItems.register();
    }
    public void init(FMLInitializationEvent event) {
    }
    public void postInit(FMLPostInitializationEvent event) {
    }
}
