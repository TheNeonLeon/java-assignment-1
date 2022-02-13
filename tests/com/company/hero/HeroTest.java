package com.company.hero;

import org.testng.annotations.Test;

import java.lang.constant.Constable;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Create class for test
public class HeroTest {
    @Test
    public void add_expectedStartingLevel_shouldReturnStartingLevel(){
        //Arrange
        Hero mage = new Mage();
        int expected = mage.level = 1;
        //Act
        int actual = mage.getLevel(1);
        //Assert
        assertEquals(expected, actual);
    }
}
