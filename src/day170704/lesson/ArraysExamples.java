package day170704.lesson;

import java.util.Arrays;

/**
 * Created by Duelist on 04.07.2017.
 */
public class ArraysExamples {
    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] strings = {"one", "two", "three", "four", "five"};
        System.out.println(Arrays.toString(strings));

        foo(1, 2, 3);
        int[] array = new int[]{1, 2, 3};
        foo(array);
    }

    private static void foo(int... arr) {
        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
