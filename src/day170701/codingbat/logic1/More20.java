package day170701.codingbat.logic1;

/**
 * Created by Duelist on 01.07.2017.
 */
public class More20 {
    public static boolean more20(int n) {
        return (n > 20 && ((n % 20 == 1) || (n % 20 == 2)));
    }

    public static void main(String[] args) {
        System.out.println(more20(20));
        System.out.println(more20(21));
        System.out.println(more20(22));
    }
}
