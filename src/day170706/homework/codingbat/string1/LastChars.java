package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class LastChars {

    private static String lastChars(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        if (aLength < 1) {
            a = "@";
        }

        if (bLength < 1) {
            b = "@";
            bLength = b.length();
        }

        return a.substring(0, 1) + b.substring(bLength - 1, bLength);
    }

    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }
}
