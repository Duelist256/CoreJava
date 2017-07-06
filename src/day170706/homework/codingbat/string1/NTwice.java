package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class NTwice {

    private static String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() - n, str.length());
        return first + last;
    }

    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }
}
