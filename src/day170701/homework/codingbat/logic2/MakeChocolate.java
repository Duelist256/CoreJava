package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 03.07.2017.
 */
public class MakeChocolate {
    private static int makeChocolate(int small, int big, int goal) {
        if (goal / 5 <= big) {
            if (goal % 5 <= small) {
                return goal % 5;
            }
            return -1;
        }

        int requiredSmall = goal - big * 5;
        if (requiredSmall <= small) {
            return requiredSmall;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
        System.out.println(makeChocolate(4, 1, 4));
        System.out.println(makeChocolate(6, 3, 10));
    }
}
