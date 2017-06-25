package day170620.homework.warmup1.monkeyTrouble;

/**
 * Created by Duelist on 24.06.2017.
 */

public class MonkeyTrouble {
    private static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
    }
}
