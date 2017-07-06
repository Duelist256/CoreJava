package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class FrontAgain {

    private static boolean frontAgain(String str) {
        if (str.length() >= 2) {
            if ((str.substring(0, 2)).equals(str.substring(str.length() - 2, str.length()))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }
}
