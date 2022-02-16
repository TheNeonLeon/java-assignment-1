package com.company.hero;

    //Ranger starts with 7 dexterity

    public class Ranger extends Hero {


        public Ranger(int level, String name,int dexterity) {
            super(level, name,1,1,dexterity);
        }

        //set primary attributes to Ranger default attributes
        public void setMagePrimaryAttribute(int dexterity) {

            this.primaryAttribute = new PrimaryAttribute(1,dexterity,1);
        }

        public PrimaryAttribute getPrimaryAttribute() {

            return primaryAttribute;
        }

        public void increaseAttributes(){
            primaryAttribute.increaseDexterity(5);
            primaryAttribute.increaseStrength(1);
            primaryAttribute.increaseIntelligence(1);

        }

        @Override
        public void totalMainPrimaryAttributes() {

        }

    }


