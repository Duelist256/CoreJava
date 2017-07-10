package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class DoubleChar {

    private static String doubleChar(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            newString.append(str.charAt(i)).append(str.charAt(i));
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }
}
