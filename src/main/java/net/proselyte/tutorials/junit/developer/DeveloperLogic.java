package net.proselyte.tutorials.junit.developer;

/**
 * Created by Raketa on 29.12.2016.
 */
public class DeveloperLogic {
    // business logic
    public int calculateHourRate(Developer developer){
        return developer.getSalary()/20/8;
    }
    public int calculateAnnualSalary(Developer developer){
        return developer.getSalary()*12;
    }
}
