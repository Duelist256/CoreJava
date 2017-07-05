package day170620.homework.warmup1;

/**
 * Created by Duelist on 22.06.2017.
 *
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true
 * if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 *
 * sleepin(false, false) → true
 * sleepin(true, false) → false
 * sleepin(false, true) → true
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