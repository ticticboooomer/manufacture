package io.ticticboom.mods.tictec;

import net.minecraft.resources.ResourceLocation;

public class Ref {
    public static final String ID = "manufacture";

    public static ResourceLocation res(String path) {
        return new ResourceLocation(ID, path);
    }

    public static final class Textures {
        public static final ResourceLocation DUST = res("item/dust");
        public static final ResourceLocation SMALL_DUST = res("item/small_dust");
        public static final ResourceLocation TINY_DUST = res("item/tiny_dust");
        public static final ResourceLocation INGOT = res("item/ingot");
        public static final ResourceLocation NUGGET = res("item/nugget");
        public static final ResourceLocation MINERAL_CHUNK = res("item/mineral_chunk");
        public static final ResourceLocation MINERAL_BLOCK = res("item/mineral_block");
    }
}
