package day170701.homework.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class ShareDigit {
    public static boolean shareDigit(int a, int b) {
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            return (a / 10 == b / 10)
                    || (a / 10 == b % 10)
                    || (a % 10 == b / 10)
                    || (a % 10 == b % 10);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));
    }
}
