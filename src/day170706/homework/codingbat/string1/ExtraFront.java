package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class ExtraFront {

    private static String extraFront(String str) {
        if (str.length() > 2) {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars + firstTwoChars + firstTwoChars;
        }
        return str + str + str;
    }

    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }
}
