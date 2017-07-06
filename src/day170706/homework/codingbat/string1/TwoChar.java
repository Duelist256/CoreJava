package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class TwoChar {

    private static String twoChar(String str, int index) {
        if (str.length() >= 2) {
            if (index < 1 || index >= str.length() - 1) {
                return str.substring(0, 2);
            }
            return str.substring(index, index + 2);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }
}
