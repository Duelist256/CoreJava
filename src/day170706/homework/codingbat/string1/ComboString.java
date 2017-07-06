package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class ComboString {

    private static String comboString(String a, String b) {
        if (a.length() >= b.length()) {
            return b + a + b;
        }
        return a + b + a;
    }

    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
    }
}
