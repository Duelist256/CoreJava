package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class ExtraEnd {

    private static String extraEnd(String str) {
        String lastTwoChars = str.substring(str.length() - 2, str.length());
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }
}
