package day170704.homework.codingbat.array3;

import java.util.Arrays;

/**
 * Created by Duelist on 15.07.2017.
 */
public class Fix45 {

    private static int[] fix45(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5) {
                int temp = nums[i];
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[j] == 4 && nums[j + 1] != 5) {
                        nums[i] = nums[j + 1];
                        nums[j + 1] = temp;
                        break;
                    }
                }
            }
        }

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == 5 && nums[i - 1] != 4) {
                int temp = nums[i];
                for (int j = i - 1; j > 0; j--) {
                    if (nums[j - 1] == 4 && nums[j] != 5) {
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 9, 4, 9, 5}; // 9, 4, 5, 4, 5, 9
        System.out.println(Arrays.toString(fix45(arr)));
        arr = new int[]{1, 4, 1, 5};
        System.out.println(Arrays.toString(fix45(arr)));
        arr = new int[]{1, 4, 1, 5, 5, 4, 1}; // 1, 4, 5, 1, 1, 4, 5
        System.out.println(Arrays.toString(fix45(arr)));
    }
}
