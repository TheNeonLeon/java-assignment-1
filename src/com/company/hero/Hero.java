package com.company.hero;

public abstract class Hero {
    protected int level;
    protected String name;

    //implement all necessary abstracts
    public abstract String name(String name);
    public abstract int level(int level);

    //Default attributes to heroes

    public int setLevel(int lvl){
        this.level = lvl;
        return lvl;
    }

    public void setIntelligence(int intelligence){

    }

    public void setStrength(int strength){
        this.setStrength(strength);
    }

    public void setDexterity(int dexterity){

        this.setDexterity(dexterity);
    }

    public int getLevel(int level) {
        return this.level;
    }
    public String getName() {
        return name;
    }

    //increment level on levelup
    public int levelUp(){
      return this.level++;
    }


}
