package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 07.07.2017.
 */
public class BigDiff {

    private static int bigDiff(int[] nums) {
        if (nums.length > 0) {
            int max = nums[0];
            int min = nums[0];

            for (int i = 1; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
            }
            return max - min;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 3, 5, 6};
        System.out.println(bigDiff(arr));
        arr = new int[]{7, 2, 10, 9};
        System.out.println(bigDiff(arr));
        arr = new int[]{2, 10, 7, 2};
        System.out.println(bigDiff(arr));
    }
}
