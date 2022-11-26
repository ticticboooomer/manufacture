package io.ticticboom.mods.tictec.materials.mineral;

import lombok.Getter;

public enum OreDensity {
    DENSE(3),
    NORMAL(2),
    SPARSE(1),
    ;
    @Getter
    private int drops;

    OreDensity(int drops) {
        this.drops = drops;
    }
}
