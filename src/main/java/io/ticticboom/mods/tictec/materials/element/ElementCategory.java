package io.ticticboom.mods.tictec.materials.element;

import lombok.Getter;

public enum ElementCategory {
    ALKALI_METALS("alkali_metals", "Alkali Metals"),
    HALOGENS("halogen", "Halogen"),
    METALLOIDS("metalloids", "Metalloids"),
    ACTINIDES("actinides", "Actinides"),
    ALKALINE_EARTH_METALS("alkaline_earth_metals", "Alkaline Metals"),
    NONMETALS("nonmetals", "Nonmetals"),
    TRANSITION_METALS("transition_metals", "Transition Metals"),
    NOBLE_GASES("noble_gases", "Noble Gases"),
    POST_TRANSITION_METALS("post_transition_metals", "Post-Transition Metals"),
    LANTHANIDES("lanthanides", "Lanthanides"),
    ;
    @Getter
    private final String id;
    @Getter
    private final String name;

    ElementCategory(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
