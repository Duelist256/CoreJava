package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 07.07.2017.
 */
public class WithoutX2 {

    private static String withoutX2(String str) {

        if ("".equals(str)) {
            return "";
        }

        if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2, str.length());
        }

        if (str.charAt(0) == 'x') {
            return str.substring(1, str.length());
        }

        if (str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2, str.length());
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }
}
