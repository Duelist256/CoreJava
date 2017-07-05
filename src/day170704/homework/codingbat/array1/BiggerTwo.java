package day170704.homework.codingbat.array1;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class BiggerTwo {

    private static int[] biggerTwo(int[] a, int[] b) {
        if (a.length == 2 && b.length == 2) {
            if (a[0] + a[1] >= b[0] + b[1]) {
                return a;
            } else {
                return b;
            }
        }
        return a;
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
