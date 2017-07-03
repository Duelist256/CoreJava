package day170701.homework.codingbat.logic2;

/**
 * Created by Duelist on 03.07.2017.
 */
public class Backjack {
    private static int blackjack(int a, int b) {

        if (a > 21 && b > 21) {
            return 0;
        }

        if (a > 21) {
            return b;
        }

        if (b > 21) {
            return a;
        }

        if (21 - a > 21 - b) {
            return b;
        }
        return a;

    }


    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
    }
}
