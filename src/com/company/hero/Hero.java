package com.company.hero;

import com.company.hero.exceptions.InvalidArmorException;
import com.company.hero.exceptions.InvalidWeaponException;
import com.company.hero.items.*;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Hero {
    protected int level;
    protected String name;
    PrimaryAttribute primaryAttribute;
    HashMap<Slot, Item> equipment = new HashMap<>();

    //create constructor
    public Hero(int level, String name, int intelligence, int strength, int dexterity){
        this.level = level;
        this.name =  name;
        this.primaryAttribute = new PrimaryAttribute(strength, dexterity, intelligence);
    }



    public int getTotal(){
        int total = primaryAttribute.getIntelligence();
        total += primaryAttribute.getDexterity();
        total += primaryAttribute.getStrength();

        for (Item item : equipment.values()) {
            if (item instanceof Armor) {
                // typecasting
                PrimaryAttribute itemAttr = ((Armor)item).getPrimaryAttribute();
                total += itemAttr.getStrength();
                total += itemAttr.getDexterity();
                total += itemAttr.getIntelligence();
            }
        }

        return total;
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

    public double equipWeapon(Item item) throws InvalidWeaponException {
        if(item.getRequiredLevel() > level){
            throw new InvalidWeaponException("Cant equip weapon");
        }

        equipment.put(item.getSlot(), item);

        return 0;
    }

    ArrayList<Weapon> classes = new ArrayList<Weapon>();

    public boolean checkValid() {
        for (WeaponType weapon : WeaponType.values()) {
            System.out.println(weapon);
        }
        return false;
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
