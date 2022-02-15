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


//totalprimaryattribute
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

//DPS CALC
    public double getDPS(){
        //if no item is equipped return dmg without weapon
        if(!equipment.containsKey(Slot.WEAPON)){
            return 1 * (getTotal() / 100.0);
        }else{
            double weaponDPS =
                    ((Weapon)equipment.get(Slot.WEAPON)).getAttackDamage()
                    * ((Weapon)equipment.get(Slot.WEAPON)).getAttackSpeed();
            return weaponDPS * (1 + (getTotal() / 100.0));
        }

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

    public boolean equipWeapon(Weapon weapon) throws InvalidWeaponException {
        if(weapon.getRequiredLevel() > level){
            throw new InvalidWeaponException("Cant equip weapon");
        }

        equipment.put(weapon.getSlot(), weapon);

        return true;
    }

    ArrayList<Weapon> classes = new ArrayList<Weapon>();

    public boolean checkValid() {
        for (WeaponType weapon : WeaponType.values()) {
            System.out.println(weapon);
        }
        return false;
    }

    public boolean equipArmor(Armor armor) throws InvalidArmorException {
        if(armor.getRequiredLevel() > level){
            throw new InvalidArmorException("Cant equip armor");
        }
        equipment.put(armor.getSlot(), armor);

        return true;
    }

    public abstract void increaseAttributes();
}
