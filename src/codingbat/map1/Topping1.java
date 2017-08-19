package codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 19.08.2017.
 */
public class Topping1 {
    public static Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        topping1(map);
        System.out.println(map);

        map.clear();
        map.put("bread", "butter");
        topping1(map);
        System.out.println(map);

        map.clear();
        map.put("pancake", "syrup");
        topping1(map);
        System.out.println(map);
    }

}
