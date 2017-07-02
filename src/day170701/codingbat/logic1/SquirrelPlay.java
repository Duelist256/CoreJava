package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class SquirrelPlay {

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        int low = 60;
        int high = 90;
        if (isSummer) {
            high += 10;
        }
        return (temp >= low && temp <= high);
    }

    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));
    }
}
