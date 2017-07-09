package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 09.07.2017.
 */
public class ZeroMax {

    private static int[] zeroMax(int[] nums) {
        int[] newArray = Arrays.copyOf(nums, nums.length);
        int largestOdd = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && nums[i] > largestOdd) {
                largestOdd = nums[i];
                newArray[i] = nums[i];
            }

            if (nums[i] == 0) {
                newArray[i] = largestOdd;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 5, 0, 3};
        System.out.println(Arrays.toString(zeroMax(arr)));
        arr = new int[]{0, 4, 0, 3};
        System.out.println(Arrays.toString(zeroMax(arr)));
        arr = new int[]{0, 1, 0};
        System.out.println(Arrays.toString(zeroMax(arr)));
    }
}
