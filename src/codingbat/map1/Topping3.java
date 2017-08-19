package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class Topping3 {
    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");
        topping3(map);
        System.out.println(map);

        map.clear();
        map.put("potato", "butter");
        topping3(map);
        System.out.println(map);

        map.clear();
        map.put("salad", "oil");
        map.put("potato", "ketchup");
        topping3(map);
        System.out.println(map);
    }
}
