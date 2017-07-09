package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 10.07.2017.
 */
public class Pre4 {

    private static int[] pre4(int[] nums) {
        int[] newArray = new int[0];
        int j = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                newArray = new int[i];
                j = newArray.length - 1;
            }
            if (newArray.length != 0 && j >= 0) {
                newArray[j--] = nums[i - 1];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 1};
        System.out.println(Arrays.toString(pre4(arr)));
        arr = new int[]{3, 1, 4};
        System.out.println(Arrays.toString(pre4(arr)));
        arr = new int[]{1, 4, 4};
        System.out.println(Arrays.toString(pre4(arr)));
    }
}
