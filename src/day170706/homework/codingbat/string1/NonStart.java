package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class NonStart {

    private static String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }
}
