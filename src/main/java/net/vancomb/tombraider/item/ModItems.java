package net.vancomb.tombraider.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.tombraider.TombRaider;
import net.vancomb.tombraider.item.custom.SurvivorPickaxeItem;
import net.vancomb.tombraider.sound.ModSounds;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TombRaider.MOD_ID);


    //CREATIVE TAB LOGO

    //public static final RegistryObject<Item> KAMIDOGU_ICON = ITEMS.register("kamidogu_icon", () -> new Item(new Item.Properties()));

    //MAIN CATEGORY

    public static final RegistryObject<SurvivorPickaxeItem> SURVIVOR_PICKAXE = ITEMS.register("survivor_pickaxe",
            () -> new SurvivorPickaxeItem(Tiers.IRON, 3, -2.6f,
                    new Item.Properties().rarity(Rarity.EPIC)));

    //MISC

    // public static final RegistryObject<ArmorItem> VINTAGE_SPECS = ITEMS.register("vintage_specs", () -> new ArmorItem()

    //MUSIC DISCS

    public static final RegistryObject<Item> TOMBRAIDER_OST_MUSIC_DISC  = ITEMS.register("tombraider_ost_music_disc",
            () -> new RecordItem(6, ModSounds.TOMBRAIDER_OST, new Item.Properties().stacksTo(1).rarity(Rarity.RARE),3920));

    public static final RegistryObject<Item> VENICE_VIOLINS_MUSIC_DISC  = ITEMS.register("venice_violins_music_disc",
            () -> new RecordItem(6, ModSounds.VENICE_VIOLINS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE),3200));



    //Registers this class in main TombRaider class
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}
