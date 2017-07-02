package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class GreenTicket {
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }

        if (a == b || b == c || a == c) {
            return 10;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(2, 2, 2));
        System.out.println(greenTicket(1, 1, 2));
    }
}
