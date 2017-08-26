package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 26.08.2017.
 */
public class Lower {

    public static List<String> lower(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        list = lower(list);
        System.out.println(list);
    }

}
