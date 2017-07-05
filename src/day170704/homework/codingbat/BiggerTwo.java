package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class BiggerTwo {

    private static int[] biggerTwo(int[] a, int[] b) {
        int aSum = 0;
        for (int num : a) {
            aSum += num;
        }

        int bSum = 0;
        for (int num : b) {
            bSum += num;
        }

        if (aSum >= bSum) {
            return a;
        }

        return b;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(Arrays.toString(biggerTwo(arr1, arr2)));
        arr1 = new int[]{3, 4};
        arr2 = new int[]{1, 2};
        System.out.println(Arrays.toString(biggerTwo(arr1, arr2)));
        arr1 = new int[]{1, 1};
        arr2 = new int[]{1, 2};
        System.out.println(Arrays.toString(biggerTwo(arr1, arr2)));
    }
}
