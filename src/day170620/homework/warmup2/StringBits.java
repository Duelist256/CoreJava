package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class StringBits {
    private static String stringBits(String str) {
        String newStr = "";
        int strLength = str.length();
        for (int i = 0; i < strLength; i+=2) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }
}
