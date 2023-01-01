package ru.jtkr.zmania.items.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.jtkr.zmania.items.ModItems;

public class ZManiaTab extends CreativeTabs {
    public ZManiaTab(String label){
        super(label);
    }
    @Override
    public Item getTabIconItem() {
        return ModItems.ZOMBINE;
    }
}
