package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class PrefixAgain {

    private static boolean prefixAgain(String str, int n) {
        String prefix;

        if (n <= str.length()) {
            prefix = str.substring(0, n);

            for (int i = 1; i < str.length() - n + 1; i++) {
                if (str.substring(i, i + n).equals(prefix)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("abXYabc", 3));
        System.out.println(prefixAgain("aa", 1));
    }
}
