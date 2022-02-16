package com.company.hero.items;

import java.util.ArrayList;
import java.util.HashMap;

//Item base abstract class item
public abstract class Item {
    //state for items
    private String itemName;
    private int requiredLevel;
    private Slot slot;

    //item constructor
    public Item(String itemName, int requiredLevel, Slot slot){
        this.itemName = itemName;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

//setter and getters
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public void setRequiredLevel(int requiredLevel){
        this.requiredLevel = requiredLevel;
    }
    public void setSlot(Slot slot){
        this.slot = slot;
    }
    public String getItemName(){
        return this.itemName;
    }
    public int getRequiredLevel(){
        return this.requiredLevel;
    }
    public Slot getSlot(){
        return this.slot;
    }

    //ArrayList<Weapon> classes = new ArrayList<Weapon>();
    /*WeaponType values[] = WeaponType.values();

    for(WeaponType weapon: WeaponType.values())
    {
        classes.add(WeaponType.AXE);
    }*/
    public void checkValid() {
        for (WeaponType weapon : WeaponType.values()) {
            System.out.println(weapon);
        }
    }
    //All items have:
    //• Name
    //• Required level to equip the item.
    //• Slot in which the item is equipped.
    //store the equipment as a HashMap<Slot, Item>

}
