package day170704.homework.codingbat.array1;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class Fix23 {

    private static int[] fix23(int[] nums) {
        if (nums.length == 3) {
            if ((nums[0] == 2 && nums[1] == 3)) {
                nums[1] = 0;
            }

            if ((nums[1] == 2 && nums[2] == 3)) {
                nums[2] = 0;
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
