package day170714.inheritance.part2;

/**
 * Created by Duelist on 14.07.2017.
 */
public abstract class Pet extends Mammal {

    public void feed() {
        makeSound();
        eat();
        makeSound();
    }

    abstract protected void eat();

    abstract protected void makeSound();

}
