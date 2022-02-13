package com.company.hero;

public abstract class Hero {
    protected int level;
    protected String name;

    //create constructor
    public Hero(int level, String name){
        this.level = level;
        this.name =  name;

    }

    //Default attributes to heroes

    public int setLevel(int lvl){
        this.level = lvl;
        return lvl;
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


    public abstract String name(String name);

    public abstract int level(int level);
}
