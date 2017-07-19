package day170719.inheritance.part4;

/**
 * Created by Duelist on 19.07.2017.
 */
public class Car extends Automobile {

    int passengers = 4;

    private static final int STANDARD_SPEED = 150;

    public int getSpeed() {
        return STANDARD_SPEED;
    }

}
