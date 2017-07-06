package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class AtFirst {

    private static String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }

        if (str.length() == 1) {
            return str.charAt(0) + "@";
        }

        return "@@";
    }

    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }
}
