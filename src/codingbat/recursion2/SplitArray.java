package codingbat.recursion2;

/**
 * Created by Duelist on 02.09.2017.
 */
public class SplitArray {

    public static boolean splitArray(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private static boolean helper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) {
            return sum1 == sum2;
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
        int[] a = {2, 2};
        System.out.println(splitArray(a));
        a = new int[]{2, 3};
        System.out.println(splitArray(a));
        a = new int[]{5, 2, 3};
        System.out.println(splitArray(a));
    }
}
