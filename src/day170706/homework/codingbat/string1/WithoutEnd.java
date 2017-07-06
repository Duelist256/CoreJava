package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class WithoutEnd {

    private static String withoutEnd(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));
    }
}
