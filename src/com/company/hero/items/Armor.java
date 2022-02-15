package com.company.hero.items;

import com.company.hero.PrimaryAttribute;

public class Armor extends Item {
    //armor state
    private ArmorType armorType;
    private PrimaryAttribute primaryAttribute;

    //armor constructor
    public Armor(String name, int requiredLevel, ArmorType armorType, Slot slot, PrimaryAttribute primaryAttribute) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.primaryAttribute = primaryAttribute;
    }
//getter for primary attribute
    public PrimaryAttribute getPrimaryAttribute() {
        return primaryAttribute;
    }
}
