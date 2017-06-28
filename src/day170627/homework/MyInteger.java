package day170627.homework;

/**
 * Created by Duelist on 27.06.2017.
 */
public class MyInteger {
    public static String toBinaryString(int x) {

        String str = "";

        // if number is negative
        if (x < 0) {
            x = x + 1;
            int num;
            while (x != 0) {
                num = Math.abs(x % 2);
                if (num == 1) {
                    str = ("0" + str);
                } else {
                    str = ("1" + str);
                }
                x /= 2;
            }
            int strLength = str.length();
            for (int i = 0; i < 32 - strLength; i++) {
                str = "1" + str;
            }
            return str;
        }

        // if number is positive
        while (x != 0) {
            str = Math.abs(x % 2) + str;
            x /= 2;
        }

        return str;
    }

    public static String toHexString(int x) {
        // TODO !
        return "";
    }

    public static String toOctString(int x) {
        // TODO !
        return "";
    }

    public static String toString(int x, int base) {

        if (base < 2 || base > 36) {
            return "" + x;
        }

        final String NUMERALS = "0123456789abcdefghijklmnopqrstuvwxyz";
        String str = "";

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }

        while (x != 0) {
            str = NUMERALS.charAt(Math.abs(x % base)) + str;
            x /= base;
        }

        if (isNegative) {
            str = "-" + str;
        }

        return str;
    }
}
