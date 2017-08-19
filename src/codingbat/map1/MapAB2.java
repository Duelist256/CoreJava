package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class MapAB2 {
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }

        return map;
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        mapAB2(map);
        System.out.println(map);

        map.clear();
        map.put("a", "aaa");
        map.put("b", "bbb");
        mapAB2(map);
        System.out.println(map);

        map.clear();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "aaa");
        mapAB2(map);
        System.out.println(map);
    }
}
