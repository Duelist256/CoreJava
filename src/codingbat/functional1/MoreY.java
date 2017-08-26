package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 26.08.2017.
 */
public class MoreY {
    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list = moreY(list);
        System.out.println(list);
    }
}
