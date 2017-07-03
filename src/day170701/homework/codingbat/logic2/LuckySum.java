package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 03.07.2017.
 */
public class LuckySum {
    private static int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a == 13) {
            return sum;
        }
        sum += a;

        if (b == 13) {
            return sum;
        }
        sum += b;

        if (c == 13) {
            return sum;
        }
        sum += c;

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
    }
}
