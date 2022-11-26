package io.ticticboom.mods.tictec.datagen;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGen {
    @SubscribeEvent
    public static void on(GatherDataEvent event) {
        event.getGenerator().addProvider(true, new ModItemModelProvider(event.getGenerator(), event.getExistingFileHelper()));
        event.getGenerator().addProvider(true, new ModBlockstateProvider(event.getGenerator(), event.getExistingFileHelper()));
    }
}
