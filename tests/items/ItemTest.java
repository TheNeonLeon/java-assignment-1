package items;

import com.company.hero.Hero;
import com.company.hero.Warrior;
import com.company.hero.exceptions.InvalidArmorException;
import com.company.hero.exceptions.InvalidWeaponException;
import com.company.hero.items.Armor;
import com.company.hero.items.ArmorType;
import com.company.hero.items.Weapon;
import com.company.hero.items.WeaponType;
import org.junit.Test;

import static com.company.hero.items.Slot.BODY;
import static com.company.hero.items.Slot.WEAPON;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void equip_weaponItem_shouldThrowInvalidWeaponException(){
    //Arrange
    Weapon weapon = new Weapon("Doom hammer", 5, WeaponType.HAMMER, 10, 2, WEAPON);
    Hero warrior = new Warrior(1,"Garrosh",1,5,2);

    String expected = "Cant equip weapon";

    //Act and assert
    Exception exception = assertThrows(InvalidWeaponException.class,
            () -> warrior.equipWeapon(weapon));
    String actual = exception.getMessage();
    assertEquals(expected, actual);

    }
    @Test
    public void equip_highLevelArmor_shouldThrowInvalidArmorException(){
        Armor armor = new Armor("Plate of hardness", 5, ArmorType.PLATE, BODY);
        Hero warrior = new Warrior(1,"Garrosh",1,5,2);

        String expected = "Cant equip armor";

        //Act and assert
        Exception exception = assertThrows(InvalidArmorException.class,
                () -> warrior.equipArmor(armor));
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }
    @Test
    public void equip_wrongWeaponType_shouldThrowInvalidWeaponException(){
        Weapon weapon = new Weapon("Bow of awesomeness", 5, WeaponType.BOW,2,5, WEAPON);
        Hero warrior = new Warrior(1,"Garrosh",1,5,2);

        String expected = "Cant equip weapon";

        Exception exception = assertThrows(InvalidWeaponException.class,
                () -> warrior.equipWeapon(weapon));
        String actual = exception.getMessage();
        assertEquals(expected, actual);


    }
    @Test
    public void equip_wrongArmorType_shouldThrowInvalidArmorException(){
        Armor armor = new Armor("Cloth of worthlessness", 2, ArmorType.CLOTH, BODY);
        Hero warrior = new Warrior(1,"Garrosh",1,5,2);
        String expected = "Cant equip armor";

        Exception exception = assertThrows(InvalidArmorException.class,
                () -> warrior.equipArmor(armor));
        String actual = exception.getMessage();
        assertEquals(expected, actual);


    }
    @Test
    public void equip_rightArmorType_shouldReturnTrue() throws InvalidArmorException {
        Armor armor = new Armor("Plate of awesomeness", 2, ArmorType.PLATE, BODY);
        Hero warrior = new Warrior(2,"Garrosh",1,5,2);

        boolean expected = true;

        //Exception exception = assertThrows(expected, () -> warrior.equipArmor(armor));



    }


}