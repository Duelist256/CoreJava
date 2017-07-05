package day170620.homework.warmup1;

/**
 * Created by Duelist on 24.06.2017.
 */
public class EndUp {
    private static String endUp(String str) {
        int strLength = str.length();
        if (strLength < 3) {
            return str.toUpperCase();
        }

        return str.substring(0, strLength-3) + str.substring(strLength-3, strLength).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }
}
