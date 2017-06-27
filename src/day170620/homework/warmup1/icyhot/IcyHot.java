package day170620.homework.warmup1.icyhot;

/**
 * Created by Duelist on 24.06.2017.
 */
public class IcyHot {
    private static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public static void main(String[] args) {
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120));
    }
}
