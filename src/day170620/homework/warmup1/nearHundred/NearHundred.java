package day170620.homework.warmup1.nearHundred;

/**
 * Created by Duelist on 22.06.2017.
 */
public class NearHundred {
    public static boolean nearHundred(int n) {
        return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
    }

    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
    }
}
