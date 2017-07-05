package day170620.homework.warmup1;

/**
 * Created by Duelist on 25.06.2017.
 */
public class PosNeg {
    private static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {

        }

        return a < 0 && b < 0 && negative ||
                ((a < 0 && b > 0) || (a > 0 && b < 0)) && !negative;
    }

    public static void main(String[] args) {
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
    }
}
