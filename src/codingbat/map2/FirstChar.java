package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 20.08.2017.
 */
public class FirstChar {
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String firstLetter = strings[i].substring(0, 1);
            if (!map.containsKey(firstLetter)) {
                map.put(firstLetter, strings[i]);
            } else {
                map.put(firstLetter, map.get(firstLetter) + strings[i]);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        String[] str = {"salt", "tea", "soda", "toast"};
        Map<String, String> map = firstChar(str);
        System.out.println(map);

        str = new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"};
        map = firstChar(str);
        System.out.println(map);

        str = new String[]{};
        map = firstChar(str);
        System.out.println(map);
    }
}
