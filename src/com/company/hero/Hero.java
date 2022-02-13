package com.company.hero;

public abstract class Hero {
    //implement all necessary abstracts
    public abstract String name(String name);
    public abstract int level(String level);

    //Default attributes to heroes
    public void setIntelligence(int intelligence){
        this.setIntelligence(1);
    }

    public void setStrength(int strength){
        this.setStrength(1);
    }

    public void setDexterity(int dexterity){
        this.setDexterity(1);
    }

}
