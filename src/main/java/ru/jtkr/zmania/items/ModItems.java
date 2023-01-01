package ru.jtkr.zmania.items;

import cpw.mods.fml.common.registry.GameRegistry;
import ru.jtkr.zmania.items.item.ZombineItem;

public class ModItems {
    public static final ZombineItem ZOMBINE = new ZombineItem();

    public static void register() {
        GameRegistry.registerItem(ZOMBINE, "zombine");
    }
}
