package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 26.08.2017.
 */
public class NoX {
    public static List<String> noX(List<String> strings) {
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ax");
        list.add("bb");
        list.add("cx");
        list = noX(list);
        System.out.println(list);
    }
}
