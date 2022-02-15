package com.company.hero.items;

public class Armor extends Item {
    private ArmorType armorType;

    public Armor(String name, int requiredLevel, ArmorType armorType, Slot slot) {
        super(name, requiredLevel, slot);
    }
}
