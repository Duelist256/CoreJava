package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 **/
public class Has271 {
    private static boolean has271(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            if (Math.abs(nums[i - 1] - nums[i - 2]) == 5
                    && Math.abs(nums[i - 2] - nums[i] - 1) <= 2) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 1};
        System.out.println(has271(arr1));
        int[] arr2 = {1, 2, 8, 1};
        System.out.println(has271(arr2));
        int[] arr3 = {2, 7, 1};
        System.out.println(has271(arr3));
    }
}
