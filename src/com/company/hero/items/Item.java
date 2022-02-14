package com.company.hero.items;

import java.util.HashMap;

//Base abstract class item
public abstract class Item {
    private String itemName;
    private int requiredLevel;
    private Slot.Slots slot;

    public Item(String itemName, int requiredLevel, Slot.Slots slot){
        this.itemName = itemName;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public void setRequiredLevel(int requiredLevel){
        this.requiredLevel = requiredLevel;
    }
    public void setSlot(Slot.Slots slot){
        this.slot = slot;
    }
    public String getItemName(){
        return this.itemName;
    }
    public int getRequiredLevel(){
        return this.requiredLevel;
    }
    public Slot.Slots getSlot(){
        return this.slot;
    }


    //All items have:
    //• Name
    //• Required level to equip the item.
    //• Slot in which the item is equipped.
    //store the equipment as a HashMap<Slot, Item>
    HashMap<Slot, Item> equip = new HashMap<>();

}
