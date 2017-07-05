package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class MidThree {

    private static int[] midThree(int[] nums) {
        if (nums.length >= 3 && nums.length % 2 == 1) {
            int halfLength = nums.length / 2;
            return new int[]{nums[halfLength - 1], nums[halfLength], nums[halfLength + 1]};
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(midThree(arr)));
        arr = new int[]{8, 6, 7, 5, 3, 0, 9};
        System.out.println(Arrays.toString(midThree(arr)));
        arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(midThree(arr)));
    }
}
