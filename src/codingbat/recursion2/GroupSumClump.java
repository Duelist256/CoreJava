package codingbat.recursion2;

/**
 * Created by Duelist on 01.09.2017.
 */
public class GroupSumClump {

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }


        int index = start;
        int number = nums[index];
        int sum = number;
        while (true) {
            if (index < nums.length - 1 && nums[index] == nums[index + 1]) {
                sum += number;
                index++;
            } else {
                break;
            }
        }
        int count = index - start + 1;

        int target2 = target;
        if (count > 1) {
            for (int i = start; i >= 0; i--) {
                target2 += nums[i];
            }

            if (target2 - sum == 0) {
                return true;
            } else {
                return groupSumClump(index + 1, nums, target);
            }
        }

        if (groupSumClump(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (groupSumClump(start + 1, nums, target)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 8};
        System.out.println(groupSumClump(0, a, 10));
        a = new int[]{1, 2, 4, 8, 1};
        System.out.println(groupSumClump(0, a, 14));
        a = new int[]{2, 4, 4, 8};
        System.out.println(groupSumClump(0, a, 14));
    }
}
