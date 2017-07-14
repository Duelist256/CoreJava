package day170714.inheritance.part2;

/**
 * Created by Duelist on 14.07.2017.
 */
public class Cat extends Pet {
    @Override
    protected void eat() {
        System.out.println("eat slowly");
    }

    @Override
    protected void makeSound() {
        System.out.println("purr");
    }
}
