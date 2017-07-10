package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class EndOther {

    private static boolean endOther(String a, String b) {
        String longStr;
        String shortStr;

        if (a.length() > b.length()) {
            longStr = a;
            shortStr = b;
        } else {
            longStr = b;
            shortStr = a;
        }

        int longLength = longStr.length();
        int shortLength = shortStr.length();
        
        return shortStr.equalsIgnoreCase(longStr.substring(longLength - shortLength, longLength));
    }

    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
    }
}
