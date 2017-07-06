package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class ConCat {

    private static String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0
                && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1, b.length());
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }
}
