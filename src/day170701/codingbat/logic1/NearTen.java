package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class NearTen {
    public static boolean nearTen(int num) {
        int remainder = num % 10;
        return (remainder >= 8 || remainder <= 2);
    }

    public static void main(String[] args) {
        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));
    }
}
