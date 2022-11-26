package io.ticticboom.mods.tictec.item.element;

import io.ticticboom.mods.tictec.materials.DustSize;
import io.ticticboom.mods.tictec.materials.element.IElement;
import lombok.Getter;

public class ElementDustItem extends BaseElementItem {

    @Getter
    private final DustSize size;

    public ElementDustItem(DustSize size, IElement elem) {
        super(elem);
        this.size = size;
    }
}
