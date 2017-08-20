package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 20.08.2017.
 */
public class WordLen {

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }

        return map;
    }

    public static void main(String[] args) {
        String[] str = {"a", "bb", "a", "bb"};
        Map<String, Integer> map = wordLen(str);
        System.out.println(map);

        str = new String[]{"this", "and", "that", "and"};
        map = wordLen(str);
        System.out.println(map);

        str = new String[]{"code", "code", "code", "bug"};
        map = wordLen(str);
        System.out.println(map);
    }
}
