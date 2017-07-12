package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 12.07.2017.
 */
public class OneTwo {

    private static String oneTwo(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length() - 2; i += 3) {
            newString.append(str.substring(i + 1, i + 3));
            newString.append(str.charAt(i));
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
    }
}
