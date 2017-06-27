package day170620.homework.warmup2.stringsplosion;

/**
 * Created by Duelist on 26.06.2017.
 */
public class StringSplosion {

    private static String stringSplosion(String str) {
        int strLength = str.length();
        String newStr = "";

        for (int i = 0; i < strLength; i++) {
            newStr += str.substring(0, i+1);
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }
}
