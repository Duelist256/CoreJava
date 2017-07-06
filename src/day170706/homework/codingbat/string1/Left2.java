package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class Left2 {

    private static String left2(String str) {
        int strLength = str.length();
        if (strLength > 2) {
            return str.substring(2, strLength) + str.substring(0, 2);
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }
}
