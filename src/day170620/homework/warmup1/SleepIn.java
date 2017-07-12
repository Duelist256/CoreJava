package day170620.homework.warmup1;

/**
 * Created by Duelist on 22.06.2017.
 */

public class SleepIn {
    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }
}