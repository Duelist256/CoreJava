package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class SpecialEleven {
    public static boolean specialEleven(int n) {
        return (n % 11 == 0) || (n % 11 == 1);
    }

    public static void main(String[] args) {
        System.out.println(specialEleven(22));
        System.out.println(specialEleven(23));
        System.out.println(specialEleven(24));
    }
}
