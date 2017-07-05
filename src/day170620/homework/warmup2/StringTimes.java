package day170620.homework.warmup2;

/**
 * Created by Duelist on 25.06.2017.
 */
public class StringTimes {
    private static String stringTimes(String str, int n) {
        if (n > 0) {
            String newStr = "";
            for (int i = 0; i < n; i++)
                newStr += str;
            return newStr;
        }
        return "";
    }


    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }
}
