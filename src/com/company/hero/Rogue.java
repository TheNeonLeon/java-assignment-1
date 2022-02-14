package com.company.hero;

public class Rogue extends Hero{
    //Rogue starts with 6 dexterity and 2 strength
        PrimaryAttribute primaryAttribute;

        public Rogue(int level, String name, int intelligence, int strength, int dexterity) {
            super(level, name,1,2,6);
        }

        //set primary attributes to Ranger default attributes
        public void setMagePrimaryAttribute(int dexterity) {

            this.primaryAttribute = new PrimaryAttribute(1,dexterity,1);
        }

        public PrimaryAttribute getPrimaryAttribute() {

            return primaryAttribute;
        }

        public void increaseAttributes() {
            primaryAttribute.increaseDexterity(4);
            primaryAttribute.increaseStrength(1);
            primaryAttribute.increaseIntelligence(1);
        }

}
