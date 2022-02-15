package com.company.hero.items;

public class Weapon extends Item{

    private WeaponType type;
    private int attackDamage;
    private double attackSpeed;

    public Weapon(String itemName, int requiredLevel, WeaponType type, int attackDamage, double attackSpeed, Slot slot)  {
        super(itemName,requiredLevel,slot);
        this.type = type;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }


}
