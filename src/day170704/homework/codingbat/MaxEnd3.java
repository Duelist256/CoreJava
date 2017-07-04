package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 04.07.2017.
 */
public class MaxEnd3 {

    private static int[] maxEnd3(int[] nums) {
        if (nums.length == 3) {
            int max = nums[0];
            if (max < nums[nums.length - 1]) {
                max = nums[nums.length - 1];
            }

            for (int i = 0; i < nums.length; i++) {
                nums[i] = max;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(maxEnd3(arr)));
        arr = new int[]{11, 5, 9};
        System.out.println(Arrays.toString(maxEnd3(arr)));
        arr = new int[]{2, 11, 3};
        System.out.println(Arrays.toString(maxEnd3(arr)));
    }
}
