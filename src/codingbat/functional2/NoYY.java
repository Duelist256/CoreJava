package codingbat.functional2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 27.08.2017.
 */
public class NoYY {

    public static List<String> noYY(List<String> strings) {
        strings.replaceAll(s -> s + "y");
        strings.removeIf(s -> s.contains("yy"));
        return strings;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("cy");

        System.out.println(noYY(list));
    }
}
