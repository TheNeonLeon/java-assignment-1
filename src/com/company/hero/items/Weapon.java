package com.company.hero.items;

public class Weapon extends Item{

    private WeaponType type;
    private double attackDamage;
    private double attackSpeed;

    public Weapon(String itemName, int requiredLevel, WeaponType type, int attackDamage, double attackSpeed, Slot slot)  {
        super(itemName,requiredLevel,slot);
        this.type = type;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }

    public WeaponType getType() {
        return type;
    }

    public double getAttackDamage() {
        return attackDamage;
    }
    public double getAttackSpeed(){
        return attackSpeed;
    }

}
