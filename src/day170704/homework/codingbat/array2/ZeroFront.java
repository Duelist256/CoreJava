package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 10.07.2017.
 */
public class ZeroFront {

    private static int[] zeroFront(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] newArray = new int[nums.length];

        for (int num : nums) {
            if (num == 0) {
                newArray[start++] = num;
            } else {
                newArray[end--] = num;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 1};
        System.out.println(Arrays.toString(zeroFront(arr)));
        arr = new int[]{0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(zeroFront(arr)));
        arr = new int[]{1, 0};
        System.out.println(Arrays.toString(zeroFront(arr)));
    }
}
