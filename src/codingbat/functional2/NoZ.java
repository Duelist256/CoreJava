package codingbat.functional2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 27.08.2017.
 */
public class NoZ {

    public static List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aza");

        System.out.println(noZ(list));
    }
}
