package codingbat.functional2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 27.08.2017.
 */
public class No34 {

    public static List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 4 || s.length() == 3);
        return strings;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("ccc");
        list.add("dddd");
        list.add("apple");

        System.out.println(no34(list));
    }
}
