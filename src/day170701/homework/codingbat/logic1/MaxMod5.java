package day170701.homework.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class MaxMod5 {
    public static int maxMod5(int a, int b) {
        int smaller;
        int larger;

        if (a == b) {
            return 0;
        }

        if (a > b) {
            smaller = b;
            larger = a;
        } else {
            larger = b;
            smaller = a;
        }

        if (a % 5 == b % 5) {
            return smaller;
        }
        return larger;
    }

    public static void main(String[] args) {
        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 2));
        System.out.println(maxMod5(3, 2));
    }
}
