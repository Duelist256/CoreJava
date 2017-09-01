package codingbat.recursion2;

/**
 * Created by Duelist on 29.08.2017.
 */
public class GroupSum {

    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (groupSum(start + 1, nums, target)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {7, 3, 5, 8};
        System.out.println(groupSum(0, a, 11));
    }

}
