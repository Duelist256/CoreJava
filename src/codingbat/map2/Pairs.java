package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 20.08.2017.
 */
public class Pairs {

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].substring(0, 1), strings[i].substring(strings[i].length() - 1,
                    strings[i].length()));
        }

        return map;
    }

    public static void main(String[] args) {
        String[] str = {"code", "bug"};
        Map<String, String> map = pairs(str);
        System.out.println(map);

        str = new String[]{"man", "moon", "main"};
        map = pairs(str);
        System.out.println(map);

        str = new String[]{"man", "moon", "good", "night"};
        map = pairs(str);
        System.out.println(map);
    }
}
