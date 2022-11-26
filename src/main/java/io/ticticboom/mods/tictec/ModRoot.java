package io.ticticboom.mods.tictec;

import io.ticticboom.mods.tictec.setup.ModBlocks;
import io.ticticboom.mods.tictec.setup.ModItems;
import net.minecraftforge.fml.common.Mod;

@Mod(Ref.ID)
public class ModRoot {

    public ModRoot() {
        ModBlocks.registerAll();
        ModItems.registerAll();
    }
}
