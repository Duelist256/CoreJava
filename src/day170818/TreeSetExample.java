package day170818;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    private static final Integer MAX = 100;


    public static void main(String[] args) {
        Random random = new Random();

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < MAX; i++) {
            set.add(random.nextInt(MAX));
        }

        SortedSet<Integer> subSet = set.subSet(20, 30);

        System.out.println(subSet);
    }
}
