package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class InOrderEqual {
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return (a <= b && b <= c);
        }
        return (a < b && b < c);
    }


    public static void main(String[] args) {
        System.out.println(inOrderEqual(2, 5, 11, false));
        System.out.println(inOrderEqual(5, 7, 6, false));
        System.out.println(inOrderEqual(5, 5, 7, true));
    }
}
