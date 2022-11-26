package io.ticticboom.mods.tictec.color;

import io.ticticboom.mods.tictec.item.element.BaseElementItem;
import io.ticticboom.mods.tictec.setup.ModItems;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementItemColors implements ItemColor {

    public static final ElementItemColors INSTANCE = new ElementItemColors();

    @Override
    public int getColor(ItemStack stack, int layer) {
        var item = stack.getItem();
        if (item instanceof BaseElementItem material) {
            return material.getElem().getColor();
        }
        return 0xFFFFFF;
    }

    @SubscribeEvent
    public static void on(RegisterColorHandlersEvent.Item event) {
        for (RegistryObject<Item> entry : ModItems.ITEMS.getEntries()) {
            event.getItemColors().register(INSTANCE, entry.get());
        }
    }
}
