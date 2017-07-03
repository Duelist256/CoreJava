package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 03.07.2017.
 */
public class NoTeenSum {
    private static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private static int fixTeen(int n) {
        if (n >= 13 && n <= 19) {
            if (n == 15 || n == 16) {
                return n;
            }
            return 0;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14));
    }
}
