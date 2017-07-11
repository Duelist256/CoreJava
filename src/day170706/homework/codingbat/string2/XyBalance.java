package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 11.07.2017.
 */
public class XyBalance {

    private static boolean xyBalance(String str) {
        boolean hasX = false;
        boolean xyBalanced = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                hasX = true;
                xyBalanced = false;
            }

            if (str.charAt(i) == 'y' && hasX) {
                xyBalanced = true;
                hasX = false;
            }
        }

        return xyBalanced;
    }

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
        System.out.println(xyBalance("bbb"));
    }
}
