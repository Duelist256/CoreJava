package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class MakeAbba {

    private static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
    }
}
