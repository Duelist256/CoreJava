package day170620.homework.warmup1;

/**
 * Created by Duelist on 24.06.2017.
 */
public class Or35 {
    private static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public static void main(String[] args) {
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
    }
}
