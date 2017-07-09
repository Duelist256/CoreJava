package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 09.07.2017.
 */
public class Post4 {

    private static int[] post4(int[] nums) {
        int newArray[] = {};
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (newArray.length > 0) {
                newArray[j] = nums[i];
                j++;
            }

            if (nums[i] == 4) {
                newArray = new int[nums.length - i - 1];
                j = 0;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 2};
        System.out.println(Arrays.toString(post4(arr)));
        arr = new int[]{4, 1, 4, 2};
        System.out.println(Arrays.toString(post4(arr)));
        arr = new int[]{4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(post4(arr)));
    }
}
