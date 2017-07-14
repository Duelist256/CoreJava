package day170714.inheritance.part2;

/**
 * Created by Duelist on 14.07.2017.
 */
public class Dog extends Pet {
    @Override
    protected void eat() {
        System.out.println("eat fast and eager");
    }

    @Override
    protected void makeSound() {
        System.out.println("bark");
    }
}
