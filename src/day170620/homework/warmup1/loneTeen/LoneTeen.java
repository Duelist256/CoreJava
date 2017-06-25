package day170620.homework.warmup1.loneTeen;

/**
 * Created by Duelist on 24.06.2017.
 */
public class LoneTeen {
    private static boolean loneTeen(int a, int b) {
        boolean first = (a >= 13 && a <= 19);
        boolean second = (b >= 13 && b <= 19);
        return (first && !second) || (second && !first);
    }

    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }
}
