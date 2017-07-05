package day170704.homework.codingbat.array1;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */
public class FrontPiece {

    private static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[]{nums[0], nums[1]};
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(frontPiece(arr)));
        arr = new int[]{1, 2};
        System.out.println(Arrays.toString(frontPiece(arr)));
        arr = new int[]{1};
        System.out.println(Arrays.toString(frontPiece(arr)));
    }
}
