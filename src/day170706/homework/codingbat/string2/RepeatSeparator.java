package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class RepeatSeparator {

    private static String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();

        if (count > 0) {
            sb.append(word);
        }

        for (int i = 1; i < count; i++) {
            sb.append(sep);
            sb.append(word);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }
}
