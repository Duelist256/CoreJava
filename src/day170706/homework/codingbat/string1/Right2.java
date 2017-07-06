package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class Right2 {

    private static String right2(String str) {
        int strLength = str.length();
        if (strLength > 2) {
            return str.substring(strLength - 2, strLength) + str.substring(0, strLength - 2);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }
}
