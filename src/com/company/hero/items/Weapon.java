package com.company.hero.items;

public class Weapon extends Item{

    enum Weapons{
        AXE,
        BOW,
        DAGGER,
        HAMMER,
        STAFF,
        SWORD,
        WAND
    }
    public Weapon(String name, int requiredLevel, Slot slot) {
        super(name, requiredLevel, slot);
    }
}
