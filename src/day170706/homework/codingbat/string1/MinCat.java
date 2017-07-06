package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class MinCat {

    private static String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        
        if (aLength < bLength) {
            return a + b.substring(bLength - aLength, bLength);
        }

        if (bLength < aLength) {
            return a.substring(aLength - bLength, aLength) + b;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
        System.out.println(minCat("x", "abc"));
    }
}
