package com.company;

import com.company.hero.Hero;
import com.company.hero.Mage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hero mage = new Mage(1,"Jaina proudmoore",8);
        System.out.println(mage.checkValid());
        Scanner in = new Scanner(System.in);

        System.out.println("Choose your class: " + " mage 1: Ranger 2: Rogue 3: Warrior: 4");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> System.out.println("You have chosen Mage");
            case 2 -> System.out.println("You have chosen Ranger");
            case 3 -> System.out.println("You have chosen Rogue");
            case 4 -> System.out.println("You have chosen Warrior");
            default -> System.out.println("Invalid choice");
        }
    }
}
