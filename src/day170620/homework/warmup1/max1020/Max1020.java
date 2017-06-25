package day170620.homework.warmup1.max1020;

/**
 * Created by Duelist on 25.06.2017.
 */
public class Max1020 {
    private static int max1020(int a, int b) {
        boolean aRange = (a >= 10 && a <= 20);
        boolean bRange = (b >= 10 && b <= 20);
        if (aRange && bRange) {
            if (a > b)
                return a;
            return b;
        }
        if (aRange) {
            return a;
        }
        if (bRange) {
            return b;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }
}
