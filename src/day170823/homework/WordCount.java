package day170823.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 27.08.2017.
 */
public class WordCount {

    public static void main(String[] args) {
        String text = "He was an old man who fished alone in a skiff " +
                "in the Gulf Stream and he had gone eighty-four days now " +
                "without taking a fish. In the first forty days a boy had been " +
                "with him. But after forty days without a fish the boy’s parents " +
                "had told him that the old man was now definitely and finally salao, " +
                "which is the worst form of unlucky, and the boy had gone at their " +
                "orders in another boat which caught three good fish the first week. " +
                "It made the boy sad to see the old man come in each day with his skiff " +
                "empty and he always went down to help him carry either the coiled lines " +
                "or the gaff and harpoon and the sail that was furled around the mast. " +
                "The sail was patched with flour sacks and, furled, it looked like " +
                "the flag of permanent defeat.";

        Map<String, Integer> map1 = wordCount(text);
        System.out.println(map1);

        Map<String, Integer> map2 = wordCountWithCompute(text);
        System.out.println(map2);

        Map<String, Integer> map3 = wordCountWithComputeIf(text);
        System.out.println(map3);

        Map<String, Integer> map4 = wordCountWithMerge(text);
        System.out.println(map4);


    }

    private static Map<String, Integer> wordCount(String text) {
        String[] arr = text.split(" ");

        deleteSymbols(arr);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return map;
    }

    private static Map<String, Integer> wordCountWithCompute(String text) {
        String[] arr = text.split(" ");

        deleteSymbols(arr);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.compute(arr[i], (key, value) -> value == null ? 1 : value + 1);
        }

        return map;
    }

    private static Map<String, Integer> wordCountWithComputeIf(String text) {
        String[] arr = text.split(" ");

        deleteSymbols(arr);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.computeIfPresent(arr[i], (key, value) -> value + 1);
            map.putIfAbsent(arr[i], 1);
        }

        return map;
    }

    private static Map<String, Integer> wordCountWithMerge(String text) {
        String[] arr = text.split(" ");

        deleteSymbols(arr);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i], 1, (n1, n2) -> n1 + n2);
        }

        return map;
    }

    private static void deleteSymbols(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            char lastChar = arr[i].charAt(arr[i].length() - 1);

            if (lastChar == '.' || lastChar == ',') {
                arr[i] = arr[i].substring(0, arr[i].length() - 1);
            }
        }
    }
}
