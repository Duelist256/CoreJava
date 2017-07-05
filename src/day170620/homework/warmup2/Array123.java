package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class Array123 {
    private static boolean array123(int[] nums) {
        if (nums.length >= 3) {
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] == 3 && nums[i-1] == 2 && nums[i-2] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 1};
        System.out.println(array123(arr1));
        int[] arr2 = {1, 1, 2, 4, 1};
        System.out.println(array123(arr2));
        int[] arr3 = {1, 1, 2, 1, 2, 3};
        System.out.println(array123(arr3));
    }
}
