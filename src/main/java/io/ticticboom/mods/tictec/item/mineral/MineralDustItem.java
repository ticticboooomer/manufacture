package io.ticticboom.mods.tictec.item.mineral;

import io.ticticboom.mods.tictec.materials.DustSize;
import io.ticticboom.mods.tictec.materials.mineral.IMineral;
import lombok.Getter;

public class MineralDustItem extends BaseMineralItem {

    @Getter
    private final DustSize size;

    public MineralDustItem(IMineral mineral, DustSize size) {
        super(mineral);
        this.size = size;
    }
}
