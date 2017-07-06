package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class EndsLy {

    private static boolean endsLy(String str) {

        if (str.length() > 1) {
            String lastTwoChars = str.substring(str.length() - 2, str.length());
            if ("ly".equals(lastTwoChars)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }
}
