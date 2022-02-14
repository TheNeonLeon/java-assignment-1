package com.company.hero.items;

public class Armor extends Item {
    enum Armors {
        CLOTH,
        LEATHER,
        MAIL,
        PLATE
    }
    public Armor(String name, int requiredLevel, Slot slot) {
        super(name, requiredLevel, slot);
    }
}
