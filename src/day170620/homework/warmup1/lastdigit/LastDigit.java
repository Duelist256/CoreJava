package day170620.homework.warmup1.lastdigit;

/**
 * Created by Duelist on 25.06.2017.
 */
public class LastDigit {

    private static boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }


    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
    }
}
