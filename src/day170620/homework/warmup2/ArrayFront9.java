package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class ArrayFront9 {
    private static boolean arrayFront9(int[] nums) {
        int length = nums.length;
        if (nums.length > 4) {
            length = 4;
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 9, 3, 4};
        System.out.println(arrayFront9(arr1));
        int[] arr2 = {1, 2, 3, 4, 9};
        System.out.println(arrayFront9(arr2));
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(arrayFront9(arr3));
    }
}
