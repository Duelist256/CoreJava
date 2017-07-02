package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class Less20 {
    public static boolean less20(int n) {
        int divider = 20;
        int diff = Math.abs((n % divider) - divider);
        return diff == 1 || diff == 2;

    }

    public static void main(String[] args) {
        System.out.println(less20(18));
        System.out.println(less20(19));
        System.out.println(less20(20));
    }
}
