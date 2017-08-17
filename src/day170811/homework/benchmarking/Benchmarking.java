package day170811.homework.benchmarking;

import java.util.*;

/**
 * Created by Duelist on 17.08.2017.
 */
public class Benchmarking {
    static final int SIZE = 1000000;

    public static void main(String[] args) {

        Random random = new Random(SIZE);
        int[] array = new int[SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        List<Integer> linkedList = new LinkedList<>();

        System.out.println("LinkedList addition");
        long start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(array[i]);
        }
        long stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start));


        List<Integer> arrayList = new ArrayList<>();

        System.out.println("ArrayList addition");
        start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(array[i]);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start));


        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("TreeSet addition");
        start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            treeSet.add(array[i]);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start));

        System.out.println();

        System.out.println("LinkedList sorting");
        start = System.nanoTime();
        Collections.sort(linkedList);
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start));

        System.out.println("ArrayList sorting");
        start = System.nanoTime();
        Collections.sort(arrayList);
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start));


        System.out.println();

        int searchElement = arrayList.get(443123);

        System.out.println("LinkedList binarySearch");
        start = System.nanoTime();
        Collections.binarySearch(linkedList, searchElement);
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start));

        System.out.println("ArrayList binarySearch");
        start = System.nanoTime();
        Collections.binarySearch(arrayList, searchElement);
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start));

        System.out.println("TreeSet binarySearch");
        start = System.nanoTime();
        treeSet.contains(searchElement);
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start));
    }
}
