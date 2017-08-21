package codingbat.map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> mapIndex = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String substr = strings[i].substring(0, 1);

            if (!mapIndex.containsKey(substr)) {
                mapIndex.put(substr, i);
            } else {
                int temp = mapIndex.get(substr);
                String strTemp = strings[temp];
                strings[temp] = strings[i];
                strings[i] = strTemp;
                mapIndex.remove(substr);
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"ab", "ac"};
        strings = allSwap(strings);
        System.out.println(Arrays.toString(strings));

        strings = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        strings = allSwap(strings);
        System.out.println(Arrays.toString(strings));

        strings = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        strings = allSwap(strings);
        System.out.println(Arrays.toString(strings));
    }
}
