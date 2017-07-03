package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 03.07.2017.
 */
public class EvenlySpaced {
    private static boolean evenlySpaced(int a, int b, int c) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (a > c) {
            int tmp = a;
            a = c;
            c = tmp;
        }

        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }

        return b - a == c - b;
    }

    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
        System.out.println(evenlySpaced(6, 2, 8));
    }
}
