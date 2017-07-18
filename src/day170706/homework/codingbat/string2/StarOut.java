package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 15.07.2017.
 */
public class StarOut {

    private static String starOut(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                continue;
            } else if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            } else if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                i += 2;
                continue;
            }
            newString.append(str.charAt(i));
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(starOut("sm*eilly"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("a*c*dd"));
        System.out.println(starOut("ab*cd"));
    }
}
