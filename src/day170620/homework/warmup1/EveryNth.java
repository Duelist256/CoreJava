package day170620.homework.warmup1;

/**
 * Created by Duelist on 25.06.2017.
 */
public class EveryNth {
    private static String everyNth(String str, int n) {
        String newString = "";
        for (int i = 0; i < str.length() -1; i += n) {
            newString += str.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));
        System.out.println(everyNth("Chocolate", 3));
    }
}
