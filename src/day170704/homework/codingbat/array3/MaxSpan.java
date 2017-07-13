package day170704.homework.codingbat.array3;

/**
 * Created by Duelist on 13.07.2017.
 */
public class MaxSpan {

    private static int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            int span = 0;
            int num = nums[i];

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == num) {
                    span = j - i + 1;
                }
            }

            if (span > maxSpan) {
                maxSpan = span;
            }
        }
        return maxSpan;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 1, 3};
        System.out.println(maxSpan(arr));
        arr = new int[]{1, 4, 2, 1, 4, 1, 4};
        System.out.println(maxSpan(arr));
        arr = new int[]{1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(arr));
        arr = new int[]{3, 9};
        System.out.println(maxSpan(arr));
    }
}
