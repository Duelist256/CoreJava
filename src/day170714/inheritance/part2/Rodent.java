package day170714.inheritance.part2;

/**
 * Created by Duelist on 14.07.2017.
 */
public abstract class Rodent extends Pet {
    @Override
    protected void makeSound() {
        System.out.println("pi-pi-pi");
    }
}
