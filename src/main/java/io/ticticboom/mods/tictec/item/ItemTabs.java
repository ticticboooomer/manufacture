package io.ticticboom.mods.tictec.item;

import io.ticticboom.mods.tictec.Ref;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ItemTabs {
    public static final CreativeModeTab ELEMENTS = new CreativeModeTab(Ref.ID + "_elements") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.ACACIA_BOAT);
        }
    };

    public static final CreativeModeTab MINERALS = new CreativeModeTab(Ref.ID + "_minerals") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.SPRUCE_BOAT);
        }
    };
}
