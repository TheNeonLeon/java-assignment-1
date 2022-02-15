package com.company;

import com.company.hero.Hero;
import com.company.hero.Mage;

public class Main {

    public static void main(String[] args) {
        Hero mage = new Mage(1,"Jaina proudmoore",8);
        System.out.println(mage.checkValid());
    }
}
