package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class Front11 {

    private static int[] front11(int[] a, int[] b) {
        if (b.length == 0 && a.length > 0) {
            return new int[]{a[0]};
        }

        if (a.length == 0 && b.length > 0) {
            return new int[]{b[0]};
        }

        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 9, 8};
        System.out.println(Arrays.toString(front11(arr1, arr2)));
        arr1 = new int[]{1};
        arr2 = new int[]{2};
        System.out.println(Arrays.toString(front11(arr1, arr2)));
        arr1 = new int[]{1, 7};
        arr2 = new int[]{};
        System.out.println(Arrays.toString(front11(arr1, arr2)));
    }
}
