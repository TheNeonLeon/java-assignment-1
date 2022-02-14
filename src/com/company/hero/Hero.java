package com.company.hero;

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

    public abstract void increaseAttributes();
}
