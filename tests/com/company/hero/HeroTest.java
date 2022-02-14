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
        int actual = mage.getLevel(1);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void add_validLevelUp_shouldReturnIncreasedStats(){
        //Arrange
        Hero mage = new Mage(1,"Jaina proudmoore",8);
        int initialStat = 8;
        int newStat = mage.levelUp();
        mage.primaryAttribute.increaseIntelligence(5);

        int expected = initialStat + 5;

        int actual = mage.levelUp(1,1,5);

        assertEquals(expected, actual);


       /* Hero mage = new Mage();

        //Act
        int actual = mage.levelUp(initialLevel, afterLevelUp);
        //Assert
        assertEquals(expected,actual);*/

    }


}
