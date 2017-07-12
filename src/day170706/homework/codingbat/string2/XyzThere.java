package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class XyzThere {

    private static boolean xyzThere(String str) {
        boolean hasDot = false;

        if (str.length() > 2 && "xyz".equals(str.substring(0, 3))) {
            hasDot = true;
        }

        for (int i = 1; i < str.length() - 2; i++) {
            if ("xyz".equals(str.substring(i, i + 3))) {
                hasDot = true;

                if (str.charAt(i - 1) == '.') {
                    hasDot = false;
                }
            }
        }
        return hasDot;
    }

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
        System.out.println(xyzThere("abc.xyzxyz"));
    }
}
