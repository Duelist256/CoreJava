package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class MapAB3 {
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }

        if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");
        mapAB3(map);
        System.out.println(map);

        map.clear();
        map.put("b", "bbb");
        map.put("c", "cake");
        mapAB3(map);
        System.out.println(map);

        map.clear();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "cake");
        mapAB3(map);
        System.out.println(map);
    }
}
