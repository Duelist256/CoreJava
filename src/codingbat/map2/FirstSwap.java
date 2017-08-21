package codingbat.map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstSwap {

    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> mapIndex = new HashMap<>();
        final Integer stop = -1;

        for (int i = 0; i < strings.length; i++) {
            String substr = strings[i].substring(0, 1);

            if (!mapIndex.containsKey(substr)) {
                mapIndex.put(substr, i);
            } else if (mapIndex.get(substr) != stop) {
                int temp = mapIndex.get(substr);
                String strTemp = strings[temp];
                strings[temp] = strings[i];
                strings[i] = strTemp;
                mapIndex.put(substr, stop);
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"ab", "ac"};
        strings = firstSwap(strings);
        System.out.println(Arrays.toString(strings));

        strings = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        strings = firstSwap(strings);
        System.out.println(Arrays.toString(strings));

        strings = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        strings = firstSwap(strings);
        System.out.println(Arrays.toString(strings));
    }
}
