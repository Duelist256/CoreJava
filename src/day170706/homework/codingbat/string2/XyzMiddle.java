package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class XyzMiddle {

    private static boolean xyzMiddle(String str) {

        if (str.length() < 3) {
            return false;
        }

        int middle = str.length() / 2;

        if (str.length() % 2 == 1) {
            if ("xyz".equals(str.substring(middle - 1, middle + 2))) {
                return true;
            }
        }

        if (str.length() % 2 == 0) {
            if ("xyz".equals(str.substring(middle - 2, middle + 1))
                    || "xyz".equals(str.substring(middle - 1, middle + 2))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("DxyzD"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }
}
