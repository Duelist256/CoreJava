package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 07.07.2017.
 */
public class CenteredAverage {

    private static int centeredAverage(int[] nums) {
        if (nums.length >= 3) {
            int max = nums[0];
            int min = nums[0];
            int sum = nums[0];
            int count = 0;

            for (int i = 1; i < nums.length; i++) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
                sum += nums[i];
                count++;
            }
            return (sum - (max + min)) / (count - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 100};
        System.out.println(centeredAverage(arr));
        arr = new int[]{1, 1, 5, 5, 10, 8, 7};
        System.out.println(centeredAverage(arr));
        arr = new int[]{-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(arr));
        arr = new int[]{1, 1, 5, 5, 10, 8, 7};
        System.out.println(centeredAverage(arr));
    }
}
