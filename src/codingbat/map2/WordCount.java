package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 20.08.2017.
 */
public class WordCount {

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], 1);
            } else {
                map.put(strings[i], map.get(strings[i]) + 1);
            }
        }

        return map;
    }


    public static void main(String[] args) {
        String[] str = {"a", "b", "a", "c", "b"};
        Map<String, Integer> map = wordCount(str);
        System.out.println(map);

        str = new String[]{"c", "b", "a"};
        map = wordCount(str);
        System.out.println(map);

        str = new String[]{"c", "c", "c", "c"};
        map = wordCount(str);
        System.out.println(map);
    }
}
