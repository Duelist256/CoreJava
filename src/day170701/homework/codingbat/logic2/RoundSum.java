package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 03.07.2017.
 */
public class RoundSum {
    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int num) {
        int remainder = num % 10;
        if (remainder >= 5) {
            return num + (10 - remainder);
        }
        return num - remainder;
    }


    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18));
        System.out.println(roundSum(12, 13, 14));
        System.out.println(roundSum(6, 4, 4));
    }
}
