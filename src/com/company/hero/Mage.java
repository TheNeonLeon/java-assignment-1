package com.company.hero;

import com.company.hero.items.WeaponType;

public class Mage extends Hero {

    public Mage(int level, String name, int intelligence){
        super(level, name, intelligence,1,1);
    }

    //set primary attributes to mage default attributes

    public void setMagePrimaryAttribute(int intelligence) {

        this.primaryAttribute = new PrimaryAttribute(1,1,intelligence);
    }
    public void checkValid() {
        for (WeaponType weapon : WeaponType.values()) {
            System.out.println(weapon);
        }
    }

    public PrimaryAttribute getPrimaryAttribute() {

        return primaryAttribute;
    }

    public void increaseAttributes(){
        primaryAttribute.increaseDexterity(1);
        primaryAttribute.increaseStrength(1);
        primaryAttribute.increaseIntelligence(5);
    }

}
