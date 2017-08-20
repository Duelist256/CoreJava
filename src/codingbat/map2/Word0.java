package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 20.08.2017.
 */
public class Word0 {
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], 0);
            }
        }
        return map;
    }


    public static void main(String[] args) {
        String[] str = {"a", "b", "a", "b"};
        Map<String, Integer> map = word0(str);
        System.out.println(map);

        str = new String[]{"a", "b", "a", "c", "b"};
        map = word0(str);
        System.out.println(map);

        str = new String[]{"c", "b", "a"};
        map = word0(str);
        System.out.println(map);
    }
}
