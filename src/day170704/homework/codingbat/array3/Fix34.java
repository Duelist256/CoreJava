package day170704.homework.codingbat.array3;

import java.util.Arrays;

/**
 * Created by Duelist on 15.07.2017.
 */
public class Fix34 {
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == 3 && nums[i + 1] != 4) {
//                int temp = nums[i + 1];
//                nums[i + 1] = 4;
//                for (int j = i + 2; j < nums.length; j++) {
//                    if (nums[j] == 4) {
//                        nums[j] = temp;
//                    }
//                }
//            }
//        }


    private static int[] fix34(int[] nums) {
        int first = 0;
        int last = nums.length - 1;

        for (; ; ) {

            while (first < nums.length && nums[first] != 3) {
                first++;
            }
            first++;

            while (last >= 0 && nums[last] != 4) {
                last--;
            }

            if (first > nums.length || last < 0) {
                break;
            }

            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 1, 4};
        System.out.println(Arrays.toString(fix34(arr)));
        arr = new int[]{1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.toString(fix34(arr)));
        arr = new int[]{3, 2, 2, 4};
        System.out.println(Arrays.toString(fix34(arr)));
        arr = new int[]{2, 3, 2, 3, 2, 4, 4};
        System.out.println(Arrays.toString(fix34(arr)));

    }
}
