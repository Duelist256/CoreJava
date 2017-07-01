package day170701.codingbat.logic1;

/**
 * Created by Duelist on 01.07.2017.
 */
public class LastDigit {
    public static boolean lastDigit(int a, int b, int c) {
        return ((a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10));
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(23, 19, 12));
        System.out.println(lastDigit(23, 19, 3));
    }
}
