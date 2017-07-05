package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class StringMatch {
    public static int stringMatch(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int count = 0;

        if (aLength > bLength) {
            for (int i = 0; i < bLength -1; i++) {
                if ((a.substring(i, i+2)).equals(b.substring(i, i+2))) {
                    count++;
                }
            }
            return count;
        }

        for (int i = 0; i < aLength -1; i++) {
            if ((b.substring(i, i+2)).equals(a.substring(i, i+2))) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }
}
