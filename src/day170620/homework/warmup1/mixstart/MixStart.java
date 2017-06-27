package day170620.homework.warmup1.mixstart;

/**
 * Created by Duelist on 24.06.2017.
 */
public class MixStart {
    private static boolean mixStart(String str) {
            return (str.length() >= 3) && (str.substring(1, 3).equals("ix"));
    }

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }
}
