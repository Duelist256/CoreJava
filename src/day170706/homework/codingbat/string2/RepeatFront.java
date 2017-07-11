package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 11.07.2017.
 */
public class RepeatFront {

    private static String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();

        if (n <= str.length()) {
            for (int i = n; i > 0; i--) {
                sb.append(str.substring(0, i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));
    }
}
