package codingbat.recursion2;

/**
 * Created by Duelist on 02.09.2017.
 */
public class Split53 {

    public static boolean split53(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private static boolean helper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) {
            return (sum1 == sum2);
        }

        if (nums[start] % 5 == 0) {
            return helper(start + 1, nums, sum1 + nums[start], sum2);
        }

        if (nums[start] % 3 == 0) {
            return helper(start + 1, nums, sum1, sum2 + nums[start]);
        }

        if (helper(start + 1, nums, sum1 + nums[start], sum2)) {
            return true;
        }

        if (helper(start + 1, nums, sum1, sum2 + nums[start])) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 1};
        System.out.println(split53(a));
        a = new int[]{1, 1, 1};
        System.out.println(split53(a));
        a = new int[]{2, 4, 2};
        System.out.println(split53(a));
    }
}
