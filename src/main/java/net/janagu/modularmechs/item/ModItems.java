package net.janagu.modularmechs.item;

import net.janagu.modularmechs.Modularmechs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Modularmechs.MOD_ID);

    public static final RegistryObject<Item> VENTCOVER = ITEMS.register("vent_cover",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MECHA_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
