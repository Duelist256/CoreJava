package day170704.homework.codingbat;

import java.util.Arrays;

/**
 * Created by Duelist on 04.07.2017.
 */
public class MakeEnds {

    private static int[] makeEnds(int[] nums) {
        if (nums.length >= 1) {
            return new int[]{nums[0], nums[nums.length - 1]};
        }
        return new int[]{0, 0};
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(makeEnds(arr)));
        arr = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(makeEnds(arr)));
        arr = new int[]{7, 4, 6, 2};
        System.out.println(Arrays.toString(makeEnds(arr)));
    }
}
