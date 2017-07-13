package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 11.07.2017.
 */
public class CountTriple {

    private static int countTriple(String str) {
        int totalTriples = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                totalTriples++;
            }
        }
        return totalTriples;
    }

    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc")); // 1
        System.out.println(countTriple("xxxabyyyycd")); // 3
        System.out.println(countTriple("a"));
        System.out.println(countTriple("122abhhh2")); // 1
    }
}
