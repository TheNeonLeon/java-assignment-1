package com.company.hero;

import org.testng.annotations.Test;

import java.lang.constant.Constable;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Create class for test
public class HeroTest {
    @Test
    public void add_expectedStartingLevel_shouldReturnStartingLevel(){
        //Arrange
        Hero mage = new Mage("Jaina proudmoore");
        int expected = mage.level = 1;
        //Act
        int actual = mage.setLevel(1);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void add_validLevelUp_shouldReturnLevelup(){
        int initialLevel = 1;
        int afterLevelUp = 2;
        int expected = 2;
       /* Hero mage = new Mage();

        //Act
        int actual = mage.levelUp(initialLevel, afterLevelUp);
        //Assert
        assertEquals(expected,actual);*/

    }


}
