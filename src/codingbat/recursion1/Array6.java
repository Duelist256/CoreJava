package codingbat.recursion1;

public class Array6 {

    public static boolean array6(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        } else if (nums[index] == 6) {
            return true;
        } else {
            return array6(nums, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 6, 4};
        System.out.println(array6(a, 0));
        a = new int[]{1, 4};
        System.out.println(array6(a, 0));
        a = new int[]{6};
        System.out.println(array6(a, 0));
    }
}
