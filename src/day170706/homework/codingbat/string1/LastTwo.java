package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class LastTwo {

    private static String lastTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, str.length() - 2)
                    + str.substring(str.length() - 1, str.length())
                    + str.substring(str.length() - 2, str.length() - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }
}
