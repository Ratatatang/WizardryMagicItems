package com.figgity.wizardryitems.items;

import com.figgity.wizardryitems.WizardryItems;
import com.figgity.wizardryitems.init.ModItems;
import com.figgity.wizardryitems.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        WizardryItems.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
