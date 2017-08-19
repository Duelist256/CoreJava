package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class MapAB {
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        mapAB(map);
        System.out.println(map);

        map.clear();
        map.put("a", "Hi");
        mapAB(map);
        System.out.println(map);

        map.clear();
        map.put("b", "There");
        mapAB(map);
        System.out.println(map);
    }

}
