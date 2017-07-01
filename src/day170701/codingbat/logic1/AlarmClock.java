package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            return (day >= 1 && day <= 5) ? "7:00":"10:00";
        }
        return (day >= 1 && day <= 5) ? "10:00":"off";
    }

    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
    }
}
