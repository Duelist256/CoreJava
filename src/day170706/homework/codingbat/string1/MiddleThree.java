package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class MiddleThree {

    private static String middleThree(String str) {
        int strLength = str.length();

        if (strLength >= 3 && strLength % 2 == 1) {
            int middle = strLength / 2;
            return str.substring(middle - 1, middle + 2);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }
}
