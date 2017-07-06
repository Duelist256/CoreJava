package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 07.07.2017.
 */
public class WithoutX {

    private static String withoutX(String str) {
        int strLength = str.length();

        if (strLength >= 1) {
            if (str.charAt(0) == 'x' && str.charAt(strLength - 1) == 'x') {
                if (strLength == 1) {
                    return "";
                }
                return str.substring(1, strLength - 1);
            }

            if (str.charAt(0) == 'x') {
                return str.substring(1, strLength);
            }

            if (str.charAt(strLength - 1) == 'x') {
                return str.substring(0, strLength - 1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        System.out.println(withoutX("x"));
    }
}
