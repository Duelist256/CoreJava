package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class FrontTimes {
    private static String frontTimes(String str, int n) {
        int strLength = str.length();
        String newStr = "";
        if (strLength < 3) {
            for (int i = 0; i < n; i++) {
                newStr += str;
            }
            return newStr;
        }

        String front = str.substring(0, 3);
        for (int i = 0; i < n; i++) {
            newStr += front;
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }
}
