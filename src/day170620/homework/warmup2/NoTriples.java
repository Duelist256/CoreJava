package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class NoTriples {
    private static boolean noTriples(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 1};
        System.out.println(noTriples(arr1));
        int[] arr2 = {1, 1, 2, 2, 2, 1};
        System.out.println(noTriples(arr2));
        int[] arr3 = {1, 1, 1, 2, 2, 2, 1};
        System.out.println(noTriples(arr3));
    }
}
