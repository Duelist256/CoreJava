package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 10.07.2017.
 */
public class ShiftLeft {

    private static int[] shiftLeft(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 2, 5, 3};
        System.out.println(Arrays.toString(shiftLeft(arr)));
        arr = new int[]{1, 2};
        System.out.println(Arrays.toString(shiftLeft(arr)));
        arr = new int[]{1};
        System.out.println(Arrays.toString(shiftLeft(arr)));
    }
}
