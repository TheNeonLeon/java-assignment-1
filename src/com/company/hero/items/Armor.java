package com.company.hero.items;

import com.company.hero.PrimaryAttribute;

public class Armor extends Item {
    private ArmorType armorType;
    private PrimaryAttribute primaryAttribute;

    public Armor(String name, int requiredLevel, ArmorType armorType, Slot slot, PrimaryAttribute primaryAttribute) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.primaryAttribute = primaryAttribute;
    }

    public PrimaryAttribute getPrimaryAttribute() {
        return primaryAttribute;
    }
}
