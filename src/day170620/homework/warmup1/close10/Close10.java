package day170620.homework.warmup1.close10;

/**
 * Created by Duelist on 25.06.2017.
 */
public class Close10 {

    private static int close10(int a, int b) {
        int absA = Math.abs(10 - a);
        int absB = Math.abs(10 - b);
        if (absA == absB)
            return 0;
        if (absA < absB)
            return a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }
}
