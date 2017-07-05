package day170620.homework.warmup1;

/**
 * Created by Duelist on 24.06.2017.
 */
public class In3050 {
    private static boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40))
                || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public static void main(String[] args) {
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }
}
