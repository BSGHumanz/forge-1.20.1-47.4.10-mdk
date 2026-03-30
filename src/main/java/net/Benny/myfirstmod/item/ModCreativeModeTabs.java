package net.Benny.myfirstmod.item;

import net.Benny.myfirstmod.MyFirstMod;
import net.Benny.myfirstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyFirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_ITEMS = CREATIVE_MODE_TABS.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KNIFE.get()))
                    .title(Component.translatable("Mod Item Tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KNIFE.get());
                        pOutput.accept(ModItems.EXPLOSIONPAPER.get());

                        pOutput.accept(Items.IRON_INGOT);
                        pOutput.accept(Items.STICK);
                        pOutput.accept(Items.DEEPSLATE);

                        pOutput.accept(ModBlocks.TAG_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
