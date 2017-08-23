package codingbat.recursion1;

public class Array220 {
    public static boolean array220(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }

        if (index < nums.length - 1 && nums[index] * 10 == nums[index + 1]) {
            return true;
        } else {
            return array220(nums, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 20};
        System.out.println(array220(a, 0));
        a = new int[]{3, 30};
        System.out.println(array220(a, 0));
        a = new int[]{3};
        System.out.println(array220(a, 0));
        a = new int[]{20, 2, 21};
        System.out.println(array220(a, 0));
    }
}
