package day170719.inheritance.part4;

/**
 * Created by Duelist on 19.07.2017.
 */
public class Automobile extends Vehicle {
    @Override
    public void move(int x, int y) {
        System.out.println("moves to " + x + ", " + y);
    }
}
