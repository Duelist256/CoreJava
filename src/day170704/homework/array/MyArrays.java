package day170704.homework.array;

/**
 * Created by Duelist on 05.07.2017.
 */

public class MyArrays {

    // TODO Rewrite with StringBuilder
    public static String toString(String[] strings) {
        String str = "[";

        if (strings == null) {
            return "null";
        }

        if (strings.length > 1) {
            str += strings[0];
        }

        for (int i = 1; i < strings.length; i++) {
            str += ", " + strings[i];
        }

        str += "]";
        return str;
    }
}
