package codingbat.recursion2;

/**
 * Created by Duelist on 02.09.2017.
 */
public class SplitOdd10 {

    public static boolean splitOdd10(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private static boolean helper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) {
            return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum1 % 2 == 1 && sum2 % 10 == 0);
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
        int[] a = {5, 5, 5};
        System.out.println(splitOdd10(a));
        a = new int[]{5, 5, 6};
        System.out.println(splitOdd10(a));
        a = new int[]{5, 5, 6, 1};
        System.out.println(splitOdd10(a));
    }
}
