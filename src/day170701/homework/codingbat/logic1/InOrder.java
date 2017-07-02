package day170701.homework.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class InOrder {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (c > b) {
            if (bOk) {
                return true;
            }
            if (b > a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false));
        System.out.println(inOrder(1, 2, 1, false));
        System.out.println(inOrder(1, 1, 2, true));
    }
}
