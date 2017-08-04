package day170804.collections;

import java.util.*;

public class DataStructuresInJava {
    public static void main(String[] args) {
        int x = 0;
        String s = "hello";

        int a[] = new int[10];
        Object[] objects = new Object[0];

        Stack<String> stack = new Stack<>();
        stack.push("one");

        List<Number> list = new LinkedList<>();
        list.add(1);
        list.add(1.3);
        list.add(0b001);

        Queue<String> queue = new ArrayDeque<>();

        PriorityQueue<String> pq = new PriorityQueue<>();

        Map<String, Integer> wordCount = new HashMap<>();

        fill(wordCount);

        Map<String, Integer> wordCount2 = new LinkedHashMap<>();
        Map<String, Integer> wordCount3 = new TreeMap<>();
    }

    private static void fill(Map<String, Integer> wordCount) {
        List<String> words = Arrays.asList("one", "two", "three", "one", "two");

        for (String word : words) {
            Integer count = wordCount.get(word);
            wordCount.put(word, count == null ? 1 : ++count);
        }

        System.out.println(wordCount);
    }
}
