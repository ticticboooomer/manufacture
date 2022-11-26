package io.ticticboom.mods.tictec.item.mineral;

import io.ticticboom.mods.tictec.item.ItemTabs;
import io.ticticboom.mods.tictec.materials.mineral.IMineral;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class MineralBlockItem extends BlockItem {

    public MineralBlockItem(Block block) {
        super(block, new Properties().tab(ItemTabs.MINERALS));
    }
}
