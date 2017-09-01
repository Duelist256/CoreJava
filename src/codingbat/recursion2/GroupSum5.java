package codingbat.recursion2;

/**
 * Created by Duelist on 01.09.2017.
 */
public class GroupSum5 {
    //    if (nums[start] % 5 == 0) {
    //        if (start < nums.length && nums[start + 1] == 1) {
    //            return groupNoAdj(start + 2, nums, target - nums[start]);
    //        } else {
    //            return groupNoAdj(start + 1, nums, target - nums[start]);
    //        }
    //    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        if (start < nums.length - 1 && nums[start] % 5 == 0) {
            if (nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            } else {
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        }


        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (groupSum5(start + 1, nums, target)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 10, 4};
        System.out.println(groupSum5(0, a, 19));
        System.out.println(groupSum5(0, a, 17));
        System.out.println(groupSum5(0, a, 12));

        a = new int[]{2, 5, 10, 25};
        System.out.println(groupSum5(0, a, 40));
    }
}
