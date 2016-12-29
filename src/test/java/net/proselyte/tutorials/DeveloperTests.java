package net.proselyte.tutorials;

import net.proselyte.tutorials.junit.developer.Developer;
import net.proselyte.tutorials.junit.developer.DeveloperLogic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Raketa on 29.12.2016.
 */
public class DeveloperTests {
    Developer developer = new Developer();
    DeveloperLogic logic = new DeveloperLogic();

    @Before
    public void setUp() {
        developer.setFirstName("Simple");
        developer.setLastName("Developer");
        developer.setSpeciality("Java");
        developer.setSalary(2000);
    }

    @Test
    public void shouldCreateDeveloperInstsnceTest() {
        assertEquals("Simple", developer.getFirstName());
        assertEquals("Developer", developer.getLastName());
        assertEquals(/*"Speciality"*/"Java", developer.getSpeciality());
        assertEquals(2000, developer.getSalary());
    }
    /*Метод shouldCreateDeveloperInstanceTest() проверяет работу getters и setters.
    Метод shouldCalculateAnnualSalaryTest() проверяет корректность вычисления годового дохода разработчика.
    Метод shouldCalculateHourRateTest() проверяет правильность вычисления часовой ставки разработчика.*/

    @Test
    public void shouldCalculateAnnualSalaryTest() {
        assertEquals(24000, logic.calculateAnnualSalary(developer));
    }

    @Test
    public void shouldCalculateHourRateTest() {
        assertEquals(12, logic.calculateHourRate(developer));
    }
}
