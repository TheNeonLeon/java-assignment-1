package com.company.hero;

public class PrimaryAttribute {
    //Declare some state
    private int strength;
    private int dexterity;
    private int intelligence;

    //Constructor
    public PrimaryAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }


    //Declare getters
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setDexterity(int dexterity){
        this.dexterity = dexterity;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    //increase stats
    public void increaseStrength(int increaseStat){
        this.strength += increaseStat;
    }
    public void increaseDexterity(int increaseStat){
        this.dexterity += increaseStat;
    }
    public void increaseIntelligence(int increaseStat){
        this.intelligence += increaseStat;
    }

}
