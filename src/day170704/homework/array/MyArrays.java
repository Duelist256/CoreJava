package day170704.homework.array;

/**
 * Created by Duelist on 05.07.2017.
 */

public class MyArrays {
    
    public static String toString(String[] strings) {
        StringBuilder sb = new StringBuilder("[");

        if (strings == null) {
            return "null";
        }

        if (strings.length > 1) {
            sb.append(strings[0]);
        }

        for (int i = 1; i < strings.length; i++) {
            sb.append(", ").append(strings[i]);
        }

        sb.append("]");
        return sb.toString();
    }
}
