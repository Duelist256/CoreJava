package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 10.07.2017.
 */
public class NotAlone {

    private static int[] notAlone(int[] nums, int val) {

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                if (nums[i + 1] > nums[i - 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(notAlone(arr, 2)));
        arr = new int[]{1, 2, 3, 2, 5, 2};
        System.out.println(Arrays.toString(notAlone(arr, 2)));
        arr = new int[]{3, 4};
        System.out.println(Arrays.toString(notAlone(arr, 3)));
    }
}
