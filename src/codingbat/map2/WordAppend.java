package codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public static String wordAppend(String[] strings) {
        String string = "";
        Map<String, Integer> mapCount = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];

            if (!mapCount.containsKey(str)) {
                mapCount.put(str, 1);
            } else {
                mapCount.put(str, mapCount.get(str) + 1);
            }

            int count = mapCount.get(str);
            if (count % 2 == 0) {
                string += str;
            }
        }

        return string;
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "a"};
        String string = wordAppend(strings);
        System.out.println(string);

        strings = new String[]{"a", "b", "a", "c", "a", "d", "a"};
        string = wordAppend(strings);
        System.out.println(string);

        strings = new String[]{"a", "", "a"};
        string = wordAppend(strings);
        System.out.println(string);
    }
}
