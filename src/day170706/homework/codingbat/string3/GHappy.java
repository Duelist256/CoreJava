package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 11.07.2017.
 */
public class GHappy {
    private static boolean gHappy(String str) {
        boolean happy = str.length() == 0;

        if (str.length() > 1) {
            if (str.charAt(0) == 'g') {
                happy = str.charAt(1) == 'g';
            }

            if (str.charAt(str.length() - 1) == 'g') {
                happy = str.charAt(str.length() - 2) == 'g';
            }

            for (int i = 1; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'g') {
                    happy = str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g';
                }
            }
        }
        return happy;
    }


    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
    }
}
