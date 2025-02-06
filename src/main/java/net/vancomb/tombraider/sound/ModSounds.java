package net.vancomb.tombraider.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vancomb.tombraider.TombRaider;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TombRaider.MOD_ID);

    public static final RegistryObject<SoundEvent> TOMBRAIDER_OST = registerSoundEvents("tombraider_ost");

    public static final RegistryObject<SoundEvent> VENICE_VIOLINS = registerSoundEvents("venice_violins");

    //Helper Method
    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(TombRaider.MOD_ID, name)));
    }

    public static void register (IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}

