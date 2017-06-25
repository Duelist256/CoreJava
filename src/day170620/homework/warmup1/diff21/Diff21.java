package day170620.homework.warmup1.diff21;

/**
 * Created by Duelist on 22.06.2017.
 */
public class Diff21 {
    public static int diff21(int n) {
        int difference = 21 - n;
        if(difference < 0) {
            return 2* (difference - difference * 2);
        }
        return difference;
    }

    public static void main(String[] args) {
        System.out.println(diff21(25));
        System.out.println(diff21(23));
        System.out.println(diff21(11));
    }
}
