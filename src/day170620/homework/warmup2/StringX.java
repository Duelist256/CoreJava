package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class StringX {
    private static String stringX(String str) {
        int strLength = str.length();

        if (strLength <= 2) {
            return str;
        }

        String newStr = "";
        String substr = str.substring(1, strLength - 1);
        for (int i = 0; i < substr.length(); i++) {
            if (substr.charAt(i) != 'x') {
                newStr += substr.charAt(i);
            }
        }
        return str.charAt(0) + newStr + str.charAt(strLength - 1);
    }


    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
}
