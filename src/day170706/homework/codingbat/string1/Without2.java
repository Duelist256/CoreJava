package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class Without2 {

    private static String without2(String str) {
        int strLength = str.length();

        if (strLength >= 2) {
            if (str.substring(0, 2).equals(str.substring(strLength - 2, strLength))) {
                return str.substring(2, strLength);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }
}
