package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class Fix23 {

    private static int[] fix23(int[] nums) {
        if (nums.length == 3) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 2 && nums[i + 1] == 3) {
                    nums[i + 1] = 0;
                }
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(fix23(arr)));
        arr = new int[]{2, 3, 5};
        System.out.println(Arrays.toString(fix23(arr)));
        arr = new int[]{1, 2, 1};
        System.out.println(Arrays.toString(fix23(arr)));
    }
}
