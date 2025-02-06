package net.vancomb.tombraider.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.tombraider.TombRaider;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TombRaider.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TOMBRAIDER_TAB = CREATIVE_MODE_TABS.register("tombraider_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SURVIVOR_PICKAXE.get()))
                    .title(Component.translatable("creativetab.tombraider_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //List added assets here

                        //Creative Tab Icon
                        //pOutput.accept(ModItems.KAMIDOGU_ICON.get()); //Can remove once actual items are listed.
                        pOutput.accept(ModItems.SURVIVOR_PICKAXE.get());
                        pOutput.accept(ModItems.TOMBRAIDER_OST_MUSIC_DISC.get());
                        pOutput.accept(ModItems.VENICE_VIOLINS_MUSIC_DISC.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
