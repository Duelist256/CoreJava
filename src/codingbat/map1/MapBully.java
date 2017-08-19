package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class MapBully {

    public static Map<String, String> mapBully(Map<String, String> map) {
        String value = "";
        if (map.containsKey("a")) {
            value = map.get("a");
            map.put("a", "");
            map.put("b", value);
        }

        return map;
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        mapBully(map);
        System.out.println(map);

        map.clear();
        map.put("a", "candy");
        mapBully(map);
        System.out.println(map);

        map.clear();
        map.put("a", "candy");
        map.put("b", "carrot");
        map.put("c", "meh");
        mapBully(map);
        System.out.println(map);
    }
}
