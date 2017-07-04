package day170704.homework.codingbat;

/**
 * Created by Duelist on 04.07.2017.
 */
public class Sum2 {

    private static int sum2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length > 1) {
            return nums[0] + nums[1];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sum2(arr));
        arr = new int[]{1, 1};
        System.out.println(sum2(arr));
        arr = new int[]{1, 1, 1, 1};
        System.out.println(sum2(arr));
    }
}
