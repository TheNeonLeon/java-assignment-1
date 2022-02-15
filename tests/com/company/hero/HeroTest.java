package com.company.hero;

import org.testng.annotations.Test;

import java.lang.constant.Constable;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Create class for test
public class HeroTest {
    @Test
    public void add_expectedStartingLevel_shouldReturnStartingLevel(){
        //Arrange
        Hero mage = new Mage(1,"Jaina proudmoore",8);
        int expected = mage.level = 1;

        //Act
        int actual = mage.getLevel();
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void add_level_shouldIncreaseLevel(){
        Hero mage = new Mage(1, "Jaina proudmoore", 8);
        System.out.println(mage.primaryAttribute.getDexterity());
        mage.levelUp();

        int expected = 2;
        int actual = mage.getLevel();
        assertEquals(expected, actual);
    }
    @Test
    public void add_validLevelUp_shouldReturnIncreasedStats(){
        //Arrange
        Hero mage = new Mage(1,"Jaina proudmoore",8);

        mage.increaseAttributes();
        System.out.println(mage.primaryAttribute.getIntelligence());
        int expected = 13;
        int actual = mage.primaryAttribute.getIntelligence();

        assertEquals(expected, actual);
 }


}
