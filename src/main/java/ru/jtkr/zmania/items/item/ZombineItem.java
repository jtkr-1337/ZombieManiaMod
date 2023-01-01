package ru.jtkr.zmania.items.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import ru.jtkr.zmania.ZMania;

public class ZombineItem extends ItemFood {
    public ZombineItem(){
        // food points(max 20), saturation, isWolfFood
        super(1,1,false);
        setUnlocalizedName("zombine");
        setTextureName(ZMania.MOD_ID+":zombine");
        setMaxStackSize(32);
//        setPotionEffect(ZMania.Zombification.id,999999,1,1);
//        setCreativeTab(ZMANIA_TAB);
    }
}
