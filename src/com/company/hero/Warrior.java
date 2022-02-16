package com.company.hero;

public class Warrior extends Hero {
    //warrior starts with 5 strength and 2 dexterity


    public Warrior(int level, String name, int intelligence, int strength, int dexterity) {
        super(level, name,1,5,2);
    }

    //set primary attributes to Ranger default attributes
    public void setWarriorPrimaryAttribute(int dexterity) {

        this.primaryAttribute = new PrimaryAttribute(1,dexterity,1);
    }

    public PrimaryAttribute getPrimaryAttribute() {

        return primaryAttribute;
    }

    public void increaseAttributes(){
        primaryAttribute.increaseDexterity(2);
        primaryAttribute.increaseStrength(3);
        primaryAttribute.increaseIntelligence(1);

    }

    @Override
    public void totalMainPrimaryAttributes() {

    }
}
