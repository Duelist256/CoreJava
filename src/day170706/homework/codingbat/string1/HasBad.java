package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class HasBad {

    private static boolean hasBad(String str) {
        return str.indexOf("bad") == 0 || str.indexOf("bad") == 1;
    }


    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }
}
