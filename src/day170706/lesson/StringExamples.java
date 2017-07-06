package day170706.lesson;

/**
 * Created by Duelist on 06.07.2017.
 */

public class StringExamples {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1 == s2);
    }
}
