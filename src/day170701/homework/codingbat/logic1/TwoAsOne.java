package day170701.homework.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
        return ((a + b == c) || (a + c == b) || (b + c == a));
    }

    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));
    }
}
