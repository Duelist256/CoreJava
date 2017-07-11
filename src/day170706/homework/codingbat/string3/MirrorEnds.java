package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 12.07.2017.
 */
public class MirrorEnds {

    private static String mirrorEnds(String string) {
        String newString = "";

        int j = 0;
        int k = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(j) == string.charAt(k)) {
                newString += string.charAt(j);
            } else {
                break;
            }
            j++;
            k--;
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }
}
