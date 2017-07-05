package day170620.homework.warmup1;

/**
 * Created by Duelist on 24.06.2017.
 */
public class NotString {

    private static String notString(String str) {
        if(str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }
}
