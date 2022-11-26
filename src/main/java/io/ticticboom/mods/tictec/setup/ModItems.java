package io.ticticboom.mods.tictec.setup;

import io.ticticboom.mods.tictec.Ref;
import io.ticticboom.mods.tictec.item.element.ElementDustItem;
import io.ticticboom.mods.tictec.item.element.IngotItem;
import io.ticticboom.mods.tictec.item.element.NuggetItem;
import io.ticticboom.mods.tictec.item.mineral.ChunkItem;
import io.ticticboom.mods.tictec.item.mineral.MineralBlockItem;
import io.ticticboom.mods.tictec.item.mineral.MineralDustItem;
import io.ticticboom.mods.tictec.materials.DustSize;
import io.ticticboom.mods.tictec.materials.element.Element;
import io.ticticboom.mods.tictec.materials.mineral.Mineral;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Locale;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ref.ID);

    public static void registerElements() {
        for (Element value : Element.values()) {
            var id = value.name().toLowerCase(Locale.ROOT);
            ITEMS.register("pure_" + id + "_ingot", () -> new IngotItem(value));
            ITEMS.register("pure_" + id + "_dust", () -> new ElementDustItem(DustSize.LARGE, value));
            ITEMS.register("pure_" + id + "_small_dust", () -> new ElementDustItem(DustSize.SMALL, value));
            ITEMS.register("pure_" + id + "_tiny_dust", () -> new ElementDustItem(DustSize.TINY, value));
            ITEMS.register("pure_" + id + "_nugget", () -> new NuggetItem(value));
        }
    }

    public static void registerMinerals() {
        for (Mineral value : Mineral.values()) {
            var id = value.getId();
            ITEMS.register(id + "_chunk", () -> new ChunkItem(value));
            ITEMS.register(id + "_dust", () -> new MineralDustItem(value, DustSize.LARGE));
            ITEMS.register(id + "_small_dust", () -> new MineralDustItem(value, DustSize.SMALL));
            ITEMS.register(id + "_tiny_dust", () -> new MineralDustItem(value, DustSize.TINY));
        }
        for (RegistryObject<Block> entry : ModBlocks.MINERALS.getEntries()) {
            ITEMS.register(entry.getId().getPath(), () -> new MineralBlockItem(entry.get()));
        }
    }

    public static void registerAll() {
        registerElements();
        registerMinerals();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

}
