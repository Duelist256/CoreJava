package day170714.inheritance.part2.hidingexample;

/**
 * Created by Duelist on 14.07.2017.
 */
public class HidingExample {
    public static void main(String[] args) {
        First.x();
        Second.x();

        First f = new Second();
        Second s = new Second();
        s.x();
        f.x();
    }
}
