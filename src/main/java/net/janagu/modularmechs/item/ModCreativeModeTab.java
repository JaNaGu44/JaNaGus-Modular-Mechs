package net.janagu.modularmechs.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MECHA_TAB = new CreativeModeTab("modularmechtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VENTCOVER.get());
        }
    };
}
