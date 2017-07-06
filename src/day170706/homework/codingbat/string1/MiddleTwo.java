package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class MiddleTwo {

    private static String middleTwo(String str) {
        int strHalfLength = str.length() / 2;
        return str.substring(strHalfLength - 1, strHalfLength + 1);
    }

    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }
}
