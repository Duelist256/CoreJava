package day170807.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkedList {
    static Random r = new Random();
    private static final int MAX = 100000;

    public static void main(String[] args) {

        List<Integer> arrayBased = new ArrayList<>();
        List<Integer> listBased = new LinkedList<>();

        testFill(arrayBased);
        testFill(listBased);

        listBased.clear();
        arrayBased.clear();

        testFillByInsertion(arrayBased);
        testFillByInsertion(listBased);
    }

    private static void testFill(List<Integer> arrayBased) {
        long start = System.nanoTime();
        fill(arrayBased);
        long stop = System.nanoTime();

        System.out.println("Elapsed: " + (stop - start) / 1000000 + " ms");
    }

    private static void testFillByInsertion(List<Integer> arrayBased) {
        long start = System.nanoTime();
        fillByInsertion(arrayBased);
        long stop = System.nanoTime();

        System.out.println("Elapsed: " + (stop - start) / 1000000 + " ms");
    }

    private static void fill(List<Integer> arrayBased) {
        for (int i = 0; i < MAX; i++) {
            arrayBased.add(r.nextInt());
        }
    }

    private static void fillByInsertion(List<Integer> arrayBased) {
        for (int i = 0; i < MAX; i++) {
            arrayBased.add(0, r.nextInt());
        }
    }
}
