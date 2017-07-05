package day170704.homework.codingbat.array1;

import java.util.Arrays;

/**
 * Created by Duelist on 04.07.2017.
 */
public class MiddleWay {

    private static int[] middleWay(int[] a, int[] b) {
        if (a.length == 3 && b.length == 3) {
            return new int[]{a[a.length / 2], b[b.length / 2]};
        }
        return new int[]{0, 0};
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(middleWay(arr1, arr2)));
        arr1 = new int[]{7, 7, 7};
        arr2 = new int[]{3, 8, 0};
        System.out.println(Arrays.toString(middleWay(arr1, arr2)));
        arr1 = new int[]{5, 2, 9};
        arr2 = new int[]{1, 4, 5};
        System.out.println(Arrays.toString(middleWay(arr1, arr2)));
    }
}
