package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 14.07.2017.
 */
public class SameEnds {

    private static String sameEnds(String string) {
        int middle = string.length() / 2;
        String firstStr = string.substring(0, middle);
        String secondStr;

        if (string.length() % 2 == 0) {
            secondStr = string.substring(middle, string.length());
        } else {
            secondStr = string.substring(middle + 1, string.length());
        }

        String newString = "";
        int length = firstStr.length();
        for (int i = 0; i < length; i++) {
            if (firstStr.equals(secondStr) && firstStr.length() > newString.length()) {
                newString = firstStr;
                break;
            } else {
                firstStr = firstStr.substring(0, firstStr.length() - 1);
                secondStr = secondStr.substring(1, secondStr.length());
            }
        }
        return newString;
    }


    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("javaXYZjava"));
        System.out.println(sameEnds("Hello! and Hello!"));
        System.out.println(sameEnds("Hello! and Hello!"));
        System.out.println(sameEnds("mymmy"));
        System.out.println(sameEnds(""));
    }
}
