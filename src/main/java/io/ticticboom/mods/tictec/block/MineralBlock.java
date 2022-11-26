package io.ticticboom.mods.tictec.block;

import io.ticticboom.mods.tictec.materials.mineral.OreDensity;
import lombok.Getter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class MineralBlock extends Block {
    @Getter
    private final OreDensity density;

    public MineralBlock(OreDensity density) {
        super(Properties.of(Material.STONE));
        this.density = density;
    }
}
