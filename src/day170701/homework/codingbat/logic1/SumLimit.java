package day170701.homework.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class SumLimit {
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        String strA = String.valueOf(a);
        String strSum = String.valueOf(sum);
        if (strA.length() == strSum.length()) {
            return sum;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));
    }
}
