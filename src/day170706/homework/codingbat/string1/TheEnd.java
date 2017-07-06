package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class TheEnd {

    private static String theEnd(String str, boolean front) {
        if (str.length() > 1) {
            if (front) {
                return "" + str.charAt(0);
            } else {
                return "" + str.charAt(str.length() - 1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
        System.out.println(theEnd("", true));
    }
}
