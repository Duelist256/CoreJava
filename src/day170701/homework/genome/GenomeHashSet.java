package day170701.homework.genome;

import day170629.homework.DataGenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Duelist on 03.07.2017.
 */
public class GenomeHashSet {
    private static final int GENOME_SIZE = 21111;
    private static final int WORD_SIZE = 222;

    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(GENOME_SIZE + WORD_SIZE);
        String[] strings = new String[GENOME_SIZE - 1];

        for (int i = 0; i < GENOME_SIZE - 1; i++) {
            strings[i] = "";
            for (int j = i; j < i + WORD_SIZE; j++) {
                strings[i] += (char) data[j];
            }
        }


//        Set<String> set = new HashSet<>();
//        for (int i = 0; i < strings.length; i++) {
//            if (!set.add(strings[i])) {
//                System.out.println(i + ": already exists");
//            }
//        }
//        System.out.println(set.size());

        System.out.println();
        long startTime = System.nanoTime();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsValue(strings[i])) {
                map.put(i, strings[i]);
            } else {
                //System.out.println(i + " - already exists");
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - startTime) / 1000000 + " milliseconds");
        System.out.println("Total duplicates: " + (strings.length - map.size()));
    }
}
