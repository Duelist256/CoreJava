package day170704.homework.codingbat.array1;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class Make2 {

    private static int[] make2(int[] a, int[] b) {
        int[] newArray = new int[2];
        
        if (a.length + b.length >= 2) {
            if (a.length == 1) {
                newArray[0] = a[0];

                if (b.length >= 1) {
                    newArray[1] = b[0];
                }
            }

            if (a.length >= 2) {
                newArray[0] = a[0];
                newArray[1] = a[1];
            }

            if (a.length < 1) {
                if (b.length == 1) {
                    newArray[0] = b[0];
                }

                if (b.length >= 2) {
                    newArray[0] = b[0];
                    newArray[1] = b[1];
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(make2(arr1, arr2)));
        arr1 = new int[]{4};
        System.out.println(Arrays.toString(make2(arr1, arr2)));
        arr1 = new int[]{};
        arr2 = new int[]{1, 2};
        System.out.println(Arrays.toString(make2(arr1, arr2)));
    }
}
