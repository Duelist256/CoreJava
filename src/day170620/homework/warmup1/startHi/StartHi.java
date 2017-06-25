package day170620.homework.warmup1.startHi;

/**
 * Created by Duelist on 24.06.2017.
 */
public class StartHi {
    private static boolean startHi(String str) {
        return ((str.length() >= 2) && str.substring(0, 2).equals("hi"));
    }

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }
}
