package io.ticticboom.mods.tictec.datagen;

import io.ticticboom.mods.tictec.Ref;
import io.ticticboom.mods.tictec.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Ref.ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (RegistryObject<Block> entry : ModBlocks.MINERALS.getEntries()) {
            BlockModelBuilder model = models().cubeAll(entry.getId().getPath(), Ref.Textures.MINERAL_BLOCK);
            simpleBlock(entry.get(), model);
            simpleBlockItem(entry.get(), model);
        }
    }
}
