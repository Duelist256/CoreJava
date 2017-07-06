package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class DeFront {

    private static String deFront(String str) {
        String string = "";
        if (str.charAt(0) == 'a') {
            string += str.charAt(0);
        }

        if (str.charAt(1) == 'b') {
            string += str.charAt(1);
        }

        string += str.substring(2, str.length());

        return string;
    }

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }
}
