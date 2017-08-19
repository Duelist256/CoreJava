package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class Topping2 {
    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "cherry");
        topping2(map);
        System.out.println(map);

        map.clear();
        map.put("spinach", "dirt");
        map.put("ice cream", "cherry");
        topping2(map);
        System.out.println(map);

        map.clear();
        map.put("yogurt", "salt");
        topping2(map);
        System.out.println(map);
    }
}
