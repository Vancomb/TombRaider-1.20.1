package net.vancomb.tombraider.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.vancomb.tombraider.TombRaider;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TombRaider.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
