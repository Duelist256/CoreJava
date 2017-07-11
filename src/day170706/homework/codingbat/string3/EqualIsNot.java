package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 12.07.2017.
 */
public class EqualIsNot {

    private static boolean equalIsNot(String str) {
        int numberOfIs = 0;
        int numberOfNot = 0;

        if (str.length() > 2) {
            for (int i = 0; i < str.length(); i++) {
                if (i < str.length() - 1 && "is".equals(str.substring(i, i + 2))) {
                    numberOfIs++;
                }
                if (i < str.length() - 2 && "not".equals(str.substring(i, i + 3))) {
                    numberOfNot++;
                }
            }
        }
        return numberOfIs == numberOfNot;
    }

    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
}
