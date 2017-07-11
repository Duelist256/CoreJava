package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 11.07.2017.
 */
public class RepeatEnd {

    private static String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();

        if (n <= str.length()) {
            String substring = str.substring(str.length() - n, str.length());
            for (int i = 0; i < n; i++) {
                sb.append(substring);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }
}
