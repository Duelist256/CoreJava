package day170816.homework;

import java.util.Arrays;

/**
 * Created by Duelist on 20.08.2017.
 */
public class Test {
    public static void main(String[] args) {
        int[] array1 = DataGenerator.generate(1000000);
        int[] array2 = Arrays.copyOf(array1, array1.length);

        long startTime = System.nanoTime();
        RadixSort.sort(array1);
        long endTime = System.nanoTime();
        System.out.println("Radix sort (LSD) - " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        QuickSort.sort(array2);
        endTime = System.nanoTime();
        System.out.println("Quick Sort - " + (endTime - startTime) / 1000000 + " ms");
    }
}
