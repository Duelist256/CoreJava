package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 03.07.2017.
 */
public class LoneSum {
    private static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        if (a == c) {
            return b;
        }
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
    }
}
