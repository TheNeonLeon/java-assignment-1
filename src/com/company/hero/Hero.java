package com.company.hero;

import com.company.hero.exceptions.InvalidArmorException;
import com.company.hero.exceptions.InvalidWeaponException;
import com.company.hero.items.Item;
import com.company.hero.items.Weapon;
import com.company.hero.items.WeaponType;

public abstract class Hero {
    protected int level;
    protected String name;
    PrimaryAttribute primaryAttribute;

    //create constructor
    public Hero(int level, String name, int intelligence, int strength, int dexterity){
        this.level = level;
        this.name =  name;
        this.primaryAttribute = new PrimaryAttribute(strength, dexterity, intelligence);
    }



    //Default attributes to heroes

    public int setLevel(int lvl){
        this.level = lvl;
        return lvl;
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return name;
    }

    //increment level on levelup
    public void levelUp(){
        increaseAttributes();
        this.level++;
    }

    public void equipWeapon(Item item) throws InvalidWeaponException {
        if(item.getRequiredLevel() > level){
            throw new InvalidWeaponException("Cant equip weapon");
        }

    }
    public void checkValid() {
        for (WeaponType weapon : WeaponType.values()) {
            System.out.println(weapon);
        }
    }
    public boolean equipArmor(Item item) throws InvalidArmorException {
        if(item.getRequiredLevel() > level){
            throw new InvalidArmorException("Cant equip armor");
        }else{
            return true;
        }
    }

    public abstract void increaseAttributes();
}
