package ru.jtkr.zmania;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import ru.jtkr.zmania.items.item.ZManiaTab;
import ru.jtkr.zmania.proxy.CommonProxy;

@Mod(modid=ZMania.MOD_ID,version = ZMania.VERSION, name = ZMania.NAME)
public class ZMania {
    public static final String MOD_ID = "zmania";
    public static final String NAME = "ZombieMania Mod";
    public static final String VERSION = "@VERSION@";
    public static CreativeTabs ZMANIA_TAB = new ZManiaTab("ZombieMania");

    @SidedProxy(
            clientSide = "ru.jtkr.zmania.proxy.ClientProxy",
            serverSide = "ru.jtkr.zmania.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
