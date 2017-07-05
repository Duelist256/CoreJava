package day170704.homework.codingbat.array1;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class SwapEnds {

    private static int[] swapEnds(int[] nums) {
        if (nums.length > 1) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }

        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(swapEnds(arr)));
        arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(swapEnds(arr)));
        arr = new int[]{8, 6, 7, 9, 5};
        System.out.println(Arrays.toString(swapEnds(arr)));
    }
}
