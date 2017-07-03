package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 03.07.2017.
 */
public class CloseFar {

    private static boolean closeFar(int a, int b, int c) {
        int diffAB = Math.abs(a - b);
        int diffBC = Math.abs(b - c);
        int diffAC = Math.abs(a - c);

        if (diffAB <= 1 && diffAC >= 2 && diffBC >= 2) {
            return true;
        }

        if (diffAC <= 1 && diffAB >= 2 && diffBC >= 2) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));
    }
}
