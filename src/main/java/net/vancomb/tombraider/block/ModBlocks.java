package net.vancomb.tombraider.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.vancomb.tombraider.TombRaider;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TombRaider.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
