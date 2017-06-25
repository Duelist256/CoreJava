package day170620.homework.warmup1.intMax;

/**
 * Created by Duelist on 24.06.2017.
 */
public class IntMax {
    private static int intMax(int a, int b, int c) {
        if(a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
        System.out.println(intMax(8, 2, 3));
    }
}
