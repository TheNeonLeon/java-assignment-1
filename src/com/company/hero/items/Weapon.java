package com.company.hero.items;

public class Weapon extends Item{

    public Weapon(String itemName, int requiredLevel, Slot.Slots slot) {
        super(itemName,requiredLevel, slot);
    }

    enum Weapons{
        AXE,
        BOW,
        DAGGER,
        HAMMER,
        STAFF,
        SWORD,
        WAND
    }

}
