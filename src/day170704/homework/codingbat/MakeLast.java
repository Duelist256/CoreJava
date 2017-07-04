package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 04.07.2017.
 */
public class MakeLast {

    private static int[] makeLast(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        newNums[newNums.length - 1] = nums[nums.length - 1];
        return newNums;
    }


    public static void main(String[] args) {
        int[] arr = {4, 5, 6};
        System.out.println(Arrays.toString(makeLast(arr)));
        arr = new int[]{1, 2};
        System.out.println(Arrays.toString(makeLast(arr)));
        arr = new int[]{3};
        System.out.println(Arrays.toString(makeLast(arr)));
    }
}
