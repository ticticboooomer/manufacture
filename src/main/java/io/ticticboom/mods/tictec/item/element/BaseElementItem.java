package io.ticticboom.mods.tictec.item.element;

import io.ticticboom.mods.tictec.item.ItemTabs;
import io.ticticboom.mods.tictec.materials.element.IElement;
import lombok.Getter;
import net.minecraft.world.item.Item;

public class BaseElementItem extends Item {
    @Getter
    private IElement elem;

    public BaseElementItem(IElement elem) {
        super(new Item.Properties().tab(ItemTabs.ELEMENTS));
        this.elem = elem;
    }
}
