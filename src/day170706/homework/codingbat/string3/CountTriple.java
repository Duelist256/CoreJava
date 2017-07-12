package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 11.07.2017.
 */
public class CountTriple {

    private static int countTriple(String str) {
        int totalTriples = 0;

        for (int i = 0; i < str.length(); i++) {
            int tripleForChar = 0;
            for (int j = i; j < str.length() - 2; j++) {
                if (str.charAt(i) == str.charAt(j)
                        && str.charAt(j) == str.charAt(j + 1)
                        && str.charAt(j + 1) == str.charAt(j + 2)) {
                    tripleForChar++;
                }
            }

            if (tripleForChar >= 3) {
                totalTriples++;
            }
        }
        return totalTriples;
    }

    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }
}
