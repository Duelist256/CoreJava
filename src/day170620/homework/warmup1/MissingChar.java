package day170620.homework.warmup1;

/**
 * Created by Duelist on 23.06.2017.
 */
public class MissingChar {
    private static String missingChar(String str, int n) {
        String newStr = "";
        if (n >= 0 && n <= str.length()-1) {
            for (int i = 0; i < str.length(); i++) {
                if (n != i) {
                    newStr += str.charAt(i);
                }
            }
            return newStr;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }
}
