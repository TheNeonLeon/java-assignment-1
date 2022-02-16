package com.company.hero;

import com.company.hero.items.Weapon;

public class Mage extends Hero {
    private Weapon wand;
    private Weapon staff;

    public Mage(int level, String name, int intelligence){
        super(1, name, intelligence,1,1);
    }

    //set primary attributes to mage default attributes

    public void setMagePrimaryAttribute(int intelligence) {

        this.primaryAttribute = new PrimaryAttribute(1,1,intelligence);
    }

    public void getPrimaryAttribute() {

        this.primaryAttribute = new PrimaryAttribute(1, 1, 8);
    }

//increaseAttributes method
    public void increaseAttributes(){
        primaryAttribute.increaseDexterity(1);
        primaryAttribute.increaseStrength(1);
        primaryAttribute.increaseIntelligence(5);
    }

    @Override
    public void totalMainPrimaryAttributes() {
        primaryAttribute.getDexterity();
        primaryAttribute.setIntelligence(8);
        primaryAttribute.setStrength(1);
    }

}
