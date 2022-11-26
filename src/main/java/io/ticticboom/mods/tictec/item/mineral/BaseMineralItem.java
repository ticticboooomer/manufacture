package io.ticticboom.mods.tictec.item.mineral;

import io.ticticboom.mods.tictec.item.ItemTabs;
import io.ticticboom.mods.tictec.materials.mineral.IMineral;
import lombok.Getter;
import net.minecraft.world.item.Item;

public class BaseMineralItem extends Item {
    @Getter
    private final IMineral mineral;
    public BaseMineralItem(IMineral mineral) {
        super(new Properties().tab(ItemTabs.MINERALS));
        this.mineral = mineral;
    }
}
