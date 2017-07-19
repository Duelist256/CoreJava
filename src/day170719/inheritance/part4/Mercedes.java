package day170719.inheritance.part4;

/**
 * Created by Duelist on 19.07.2017.
 */
public class Mercedes extends Car {
    @Override
    public int getSpeed() {
        return super.getSpeed() + 50;
    }
}
