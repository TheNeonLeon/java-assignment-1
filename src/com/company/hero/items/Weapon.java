package com.company.hero.items;

public class Weapon extends Item{
//state for weapon class
    private WeaponType type;
    private double attackDamage;
    private double attackSpeed;

    //constructor for weapon
    public Weapon(String itemName, int requiredLevel, WeaponType type, int attackDamage, double attackSpeed, Slot slot)  {
        super(itemName,requiredLevel,slot);
        this.type = type;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
    }

    //getters for the private state
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
