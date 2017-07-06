package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class SeeColor {

    private static String seeColor(String str) {
        if (str.length() >= 3 && "red".equals(str.substring(0, 3))) {
            return "red";
        }
        if (str.length() >= 4 && "blue".equals(str.substring(0, 4))) {
            return "blue";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }
}
