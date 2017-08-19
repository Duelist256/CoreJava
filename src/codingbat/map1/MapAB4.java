package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class MapAB4 {
    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            int aLength = map.get("a").length();
            int bLength = map.get("b").length();

            if (aLength == bLength) {
                map.put("a", "");
                map.put("b", "");
            } else if (aLength > bLength) {
                map.put("c", map.get("a"));
            } else {
                map.put("c", map.get("b"));
            }
        }
        return map;
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        mapAB4(map);
        System.out.println(map);

        map.clear();
        map.put("a", "aa");
        map.put("b", "bbb");
        map.put("c", "cake");
        mapAB4(map);
        System.out.println(map);

        map.clear();
        map.put("a", "aa");
        map.put("b", "bbb");
        mapAB4(map);
        System.out.println(map);
    }
}
