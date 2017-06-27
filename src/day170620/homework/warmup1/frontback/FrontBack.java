package day170620.homework.warmup1.frontback;

/**
 * Created by Duelist on 24.06.2017.
 */
public class FrontBack {
    private static String frontBack(String str) {
        int length = str.length();
        if (length > 1) {
            return str.charAt(length-1) + str.substring(1, length-1) + str.charAt(0);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }
}
