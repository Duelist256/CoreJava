package day170620.homework.warmup1.backAround;

/**
 * Created by Duelist on 24.06.2017.
 */
public class BackAround {
    private static String backAround(String str) {
        try {
            char lastChar = str.charAt(str.length()-1);
            return lastChar + str + lastChar;
        } catch (StringIndexOutOfBoundsException e) {
            return str;
        }
    }

    public static void main(String[] args) {
//        System.out.println(backAround("cat"));
//        System.out.println(backAround("Hello"));
//        System.out.println(backAround("a"));
        long startTime = System.nanoTime();
        backAround("");
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }
}
