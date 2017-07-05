package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class MakeMiddle {

    private static int[] makeMiddle(int[] nums) {
        int numsLength = nums.length;
        if (numsLength >= 2) {
            return new int[]{nums[numsLength / 2 - 1], nums[numsLength / 2]};
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(makeMiddle(arr)));
        arr = new int[]{7, 1, 2, 3, 4, 9};
        System.out.println(Arrays.toString(makeMiddle(arr)));
        arr = new int[]{1, 2};
        System.out.println(Arrays.toString(makeMiddle(arr)));
    }
}
