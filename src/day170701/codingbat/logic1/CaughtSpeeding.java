package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int low = 61;
        int high = 80;

        if (isBirthday) {
            low += 5;
            high += 5;
        }

        if (speed < low) {
            return 0;
        }
        if (speed >= low && speed <= high) {
            return 1;
        }
        return 2;
    }


    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));
    }
}
