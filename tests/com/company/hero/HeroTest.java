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
    public void add_expectedStartingStats_shouldReturnStartingStatsForMage(){
        //Arrange
        Hero mage = new Mage(1,"Jaina proudmoore",8);

        //Act
        PrimaryAttribute actual = mage.getAttributes();
        //Assert
        assertEquals(1, actual.getStrength());
        assertEquals(1, actual.getDexterity());
        assertEquals(8,actual.getIntelligence());
    }
    @Test
    public void add_expectedStartingStats_shouldReturnStartingStatsForHunter(){
        //Arrange
        Hero ranger = new Ranger(1,"Bhor",7);

        //Act
        PrimaryAttribute actual = ranger.getAttributes();
        //Assert
        assertEquals(1, actual.getStrength());
        assertEquals(7, actual.getDexterity());
        assertEquals(1,actual.getIntelligence());
    }
    @Test
    public void add_expectedStartingStats_shouldReturnStartingStatsForRogue(){
        //Arrange
        Hero rogue = new Rogue(1,"hulfdan",1,2,6);

        //Act
        PrimaryAttribute actual = rogue.getAttributes();
        //Assert
        assertEquals(2, actual.getStrength());
        assertEquals(6, actual.getDexterity());
        assertEquals(1,actual.getIntelligence());
    }
    @Test
    public void add_expectedStartingStats_shouldReturnStartingStatsForWarrior(){
        //Arrange
        Hero warrior = new Warrior(1,"Garrosh Hellscream",1,5,2);

        //Act
        PrimaryAttribute actual = warrior.getAttributes();
        //Assert
        assertEquals(2, actual.getStrength());
        assertEquals(6, actual.getDexterity());
        assertEquals(1,actual.getIntelligence());
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
    public void add_validLevelUp_shouldReturnIncreasedStatsForMage(){
        //Arrange
        Hero ranger = new Ranger(1,"Jaina proudmoore",7);

        ranger.levelUp();

        PrimaryAttribute actual = ranger.getAttributes();

        assertEquals(2, actual.getStrength());
        assertEquals(12, actual.getDexterity());
        assertEquals(2,actual.getIntelligence());
 }
    @Test
    public void add_validLevelUp_shouldReturnIncreasedStatsForRanger(){
        //Arrange
        Hero ranger = new Ranger(1,"bob",7);

        ranger.levelUp();

        PrimaryAttribute actual = ranger.getAttributes();

        assertEquals(2, actual.getStrength());
        assertEquals(12, actual.getDexterity());
        assertEquals(2,actual.getIntelligence());
    }
    @Test
    public void add_validLevelUp_shouldReturnIncreasedStatsForRogue(){
        //Arrange
        Hero rogue = new Rogue(1,"rogi",1,2,6);

        rogue.levelUp();

        PrimaryAttribute actual = rogue.getAttributes();

        assertEquals(3, actual.getStrength());
        assertEquals(10, actual.getDexterity());
        assertEquals(2, actual.getIntelligence());
    }

    @Test
    public void add_validLevelUp_shouldReturnIncreasedStatsForWarrior() {
        Hero warrior = new Warrior(1,"Garrosh Hellscream", 1,5,2);

        warrior.levelUp();

        PrimaryAttribute actual = warrior.getAttributes();

        assertEquals(8, actual.getStrength());
        assertEquals(4,actual.getDexterity());
        assertEquals(2,actual.getIntelligence());
    }

}
