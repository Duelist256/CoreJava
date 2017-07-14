package day170714.inheritance.part2;

/**
 * Created by Duelist on 14.07.2017.
 */
public class Rat extends Rodent {

    @Override
    protected void makeSound() {
        teethClac();
        super.makeSound();
        teethClac();
    }

    private void teethClac() {
        System.out.println("clac-clac");
    }

    @Override
    protected void eat() {
        System.out.println("grab-n-run");
    }
}
