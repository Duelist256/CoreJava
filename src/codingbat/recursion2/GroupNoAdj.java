package codingbat.recursion2;

/**
 * Created by Duelist on 01.09.2017.
 */
public class GroupNoAdj {
    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }


        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }

        if (groupNoAdj(start + 1, nums, target)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 10, 4};
        System.out.println(groupNoAdj(0, a, 12));
        System.out.println(groupNoAdj(0, a, 14));
        System.out.println(groupNoAdj(0, a, 7));
    }

}
