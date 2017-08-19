package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class MapShare {
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("c")) {
            map.remove("c");
        }

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        mapShare(map);
        System.out.println(map);

        map.clear();
        map.put("b", "xyz");
        map.put("c", "ccc");
        mapShare(map);
        System.out.println(map);

        map.clear();
        map.put("a", "aaa");
        map.put("c", "meh");
        map.put("d", "hi");
        mapShare(map);
        System.out.println(map);
    }
}
