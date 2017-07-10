package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class SameStarChar {

    private static boolean sameStarChar(String str) {
        
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
        System.out.println(sameStarChar("abcDEF"));
    }
}
