package com.company.hero;

public class PrimaryAttribute {
    //Declare some state
    private int strength;
    private int dexterity;
    private int intelligence;

    public void primaryAttribute(int strength, int dexterity, int intelligence){
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    //Declare getters to change private state
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getIntelligence(){
        return intelligence;
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
