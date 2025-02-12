package net.vancomb.tombraider;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.vancomb.tombraider.block.ModBlocks;
import net.vancomb.tombraider.item.CreativeModeTabs;
import net.vancomb.tombraider.item.ModItems;
import net.vancomb.tombraider.sound.ModSounds;
import org.slf4j.Logger;


@Mod(TombRaider.MOD_ID)
public class TombRaider {
    public static final String MOD_ID = "tombraider";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TombRaider()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);           //Registered ModItems Class
        CreativeModeTabs.register(modEventBus);   //Registered CreativeModeTabs Class
        ModSounds.register(modEventBus);          //Registered ModSounds Class

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}
}


