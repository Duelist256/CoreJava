package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class Love6 {

    public static boolean love6(int a, int b) {
        return ((a == 6) || (b == 6) || (Math.abs(a - b) == 6) || (a + b == 6));
    }

    public static void main(String[] args) {
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));
    }
}
