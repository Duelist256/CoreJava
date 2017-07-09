package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 09.07.2017.
 */
public class WithoutTen {

    private static int[] withoutTen(int[] nums) {
        int[] newArray = new int[nums.length];
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 10) {
                newArray[i++] = nums[j];
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 0, 0};
        System.out.println(Arrays.toString(withoutTen(arr)));
        arr = new int[]{2, 0, 0};
        System.out.println(Arrays.toString(withoutTen(arr)));
        arr = new int[]{1, 99, 0};
        System.out.println(Arrays.toString(withoutTen(arr)));
    }
}
