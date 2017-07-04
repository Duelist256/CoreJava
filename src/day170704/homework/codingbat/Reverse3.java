package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 04.07.2017.
 */
public class Reverse3 {

    private static int[] reverse3(int[] nums) {
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length / 2; i++) { // if
                int temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(reverse3(arr)));
        arr = new int[]{5, 11, 9};
        System.out.println(Arrays.toString(reverse3(arr)));
        arr = new int[]{7, 0, 0};
        System.out.println(Arrays.toString(reverse3(arr)));
    }
}
