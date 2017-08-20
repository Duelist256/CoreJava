package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 20.08.2017.
 */
public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!map1.containsKey(strings[i])) {
                map1.put(strings[i], 1);
            } else {
                map1.put(strings[i], map1.get(strings[i]) + 1);
            }

            map2.put(strings[i], map1.get(strings[i]) >= 2);
        }

        return map2;
    }


    public static void main(String[] args) {
        String[] str = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> map = wordMultiple(str);
        System.out.println(map);

        str = new String[]{"c", "b", "a"};
        map = wordMultiple(str);
        System.out.println(map);

        str = new String[]{"c", "c", "c", "c"};
        map = wordMultiple(str);
        System.out.println(map);
    }
}
