package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 09.07.2017.
 */
public class TenRun {

    private static int[] tenRun(int[] nums) {
        int number = 0;
        boolean isMultipleOf10 = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 10 == 0) {
                number = nums[i];
                isMultipleOf10 = true;
            }

            if (isMultipleOf10 && nums[i] % 10 != 0) {
                nums[i] = number;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2, 10, 3, 4, 20, 5};
        System.out.println(Arrays.toString(tenRun(arr)));
        arr = new int[]{10, 1, 20, 2};
        System.out.println(Arrays.toString(tenRun(arr)));
        arr = new int[]{10, 1, 9, 20};
        System.out.println(Arrays.toString(tenRun(arr)));
        arr = new int[]{2, 3, 10, 1, 9, 20};
        System.out.println(Arrays.toString(tenRun(arr)));
        arr = new int[]{0, 2};
        System.out.println(Arrays.toString(tenRun(arr)));
        arr = new int[]{0, 0, 2, 3, 5, 10, 0, 5, 2, 20, 2};
        System.out.println(Arrays.toString(tenRun(arr)));
    }
}
