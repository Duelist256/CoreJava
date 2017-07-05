package day170704.homework.codingbat.array1;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class PlusTwo {

    private static int[] plusTwo(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }

        for (int i = a.length, j = 0; i < newArray.length; i++, j++) {
            newArray[i] = b[j];
            newArray[i] = b[j];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(Arrays.toString(plusTwo(arr1, arr2)));
        arr1 = new int[]{4, 4};
        arr2 = new int[]{2, 2};
        System.out.println(Arrays.toString(plusTwo(arr1, arr2)));
        arr1 = new int[]{9, 2};
        arr2 = new int[]{3, 4};
        System.out.println(Arrays.toString(plusTwo(arr1, arr2)));
    }
}
