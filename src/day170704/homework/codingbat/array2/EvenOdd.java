package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 09.07.2017.
 */
public class EvenOdd {

    private static int[] evenOdd(int[] nums) {
        int[] newArray = new int[nums.length];
        int j = 0;
        int k = newArray.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArray[j++] = nums[i];
            }

            if (nums[i] % 2 == 1) {
                newArray[k--] = nums[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(evenOdd(arr)));
        arr = new int[]{3, 3, 2};
        System.out.println(Arrays.toString(evenOdd(arr)));
        arr = new int[]{2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(arr)));
    }
}
