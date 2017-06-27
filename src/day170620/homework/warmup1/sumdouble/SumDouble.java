package day170620.homework.warmup1.sumdouble;

/**
 * Created by Duelist on 24.06.2017.
 */
public class SumDouble {
    private static int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }
}
