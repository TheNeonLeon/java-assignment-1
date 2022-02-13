package com.company.hero;

public class Mage extends Hero {

    public Mage(String name){
        super(1, name);
    }

    @Override
    public String name(String name) {
        return this.name;
    }

    @Override
    public int level(int level) {
        return this.level;
    }




    //Mage starts with 8 intelligence
    /*public getIntelligence(){
        return
    }*/
}
