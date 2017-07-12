package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 11.07.2017.
 */
public class MixString {

    private static String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String longStr;
        String shortStr;

        if (a.length() > b.length()) {
            longStr = a;
            shortStr = b;
        } else {
            longStr = b;
            shortStr = a;
        }

        for (int i = 0; i < longStr.length(); i++) {
            if (i < shortStr.length()) {
                sb.append(a.charAt(i)).append(b.charAt(i));
            } else {
                sb.append(longStr.charAt(i));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }
}
