package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class AltPairs {
    private static String altPairs(String str) {
        int strLength = str.length();
        if (strLength <= 2) {
            return str;
        }

        String newStr = "";
        for (int i = 0; i < strLength; i += 4) {
            newStr = newStr + str.charAt(i);
            if (i < strLength - 1) {
                newStr = newStr + str.charAt(i+1);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println(altPairs("yak"));
    }
}
