package net.Benny.myfirstmod.item;

import net.Benny.myfirstmod.MyFirstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MOD_ID);

    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXPLOSIONPAPER = ITEMS.register("explosion_paper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREEPERESSENCE = ITEMS.register("creeper_essence",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
