package day170707.homework.string;

/**
 * Created by Duelist on 08.07.2017.
 */
public class MyString {

    public static String trim(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }

        if (str.indexOf(' ') != 0 && str.lastIndexOf(' ') != str.length() - 1) {
            return str;
        }

        int i = str.length() - 1;
        while (str.charAt(i) <= ' ') {
            i--;
        }

        int j = 0;
        while (str.charAt(j) <= ' ') {
            j++;
        }

        return str.substring(j, i + 1);
    }
}
