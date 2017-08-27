package codingbat.functional2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 27.08.2017.
 */
public class NoLong {

    public static List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("not");
        list.add("too");
        list.add("long");

        System.out.println(noLong(list));
    }
}
