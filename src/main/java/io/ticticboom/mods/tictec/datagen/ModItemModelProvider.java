package io.ticticboom.mods.tictec.datagen;

import io.ticticboom.mods.tictec.Ref;
import io.ticticboom.mods.tictec.item.element.ElementDustItem;
import io.ticticboom.mods.tictec.item.element.IngotItem;
import io.ticticboom.mods.tictec.item.element.NuggetItem;
import io.ticticboom.mods.tictec.item.mineral.ChunkItem;
import io.ticticboom.mods.tictec.item.mineral.MineralBlockItem;
import io.ticticboom.mods.tictec.item.mineral.MineralDustItem;
import io.ticticboom.mods.tictec.materials.DustSize;
import io.ticticboom.mods.tictec.setup.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Ref.ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Item> entry : ModItems.ITEMS.getEntries()) {
            if (entry.get() instanceof ElementDustItem dust) {
                if (dust.getSize() == DustSize.LARGE) {
                    this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.DUST);
                } else if (dust.getSize() == DustSize.SMALL) {
                    this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.SMALL_DUST);
                } else if (dust.getSize() == DustSize.TINY) {
                    this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.TINY_DUST);
                }
            }
            if (entry.get() instanceof IngotItem) {
                this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.INGOT);
            }
            if (entry.get() instanceof NuggetItem) {
                this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.NUGGET);
            }
            if (entry.get() instanceof ChunkItem) {
                this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.MINERAL_CHUNK);
            }

            if (entry.get() instanceof MineralDustItem dust) {
                if (dust.getSize() == DustSize.LARGE) {
                    this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.DUST);
                } else if (dust.getSize() == DustSize.SMALL) {
                    this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.SMALL_DUST);
                } else if (dust.getSize() == DustSize.TINY) {
                    this.getBuilder(entry.get().toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", Ref.Textures.TINY_DUST);
                }
            }
        }
    }
}
