package io.ticticboom.mods.tictec.setup;

import io.ticticboom.mods.tictec.Ref;
import io.ticticboom.mods.tictec.block.MineralBlock;
import io.ticticboom.mods.tictec.materials.mineral.Mineral;
import io.ticticboom.mods.tictec.materials.mineral.OreDensity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> MINERALS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ref.ID);

    public static void registerMinerals() {
        for (Mineral value : Mineral.values()) {
            var id = value.getId();
            MINERALS.register("sparse_" + id + "_block", () -> new MineralBlock(OreDensity.SPARSE));
            MINERALS.register(id + "_block", () -> new MineralBlock(OreDensity.NORMAL));
            MINERALS.register("dense_" + id + "_block", () -> new MineralBlock(OreDensity.DENSE));
        }
    }

    public static void registerAll() {
        registerMinerals();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MINERALS.register(bus);
    }
}
