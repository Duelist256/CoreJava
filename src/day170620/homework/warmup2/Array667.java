package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class Array667 {
    private static int array667(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == 6 && (nums[i] == 6 || nums[i] == 7)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 6, 2};
        System.out.println(array667(arr1));
        int[] arr2 = {6, 6, 2, 6};
        System.out.println(array667(arr2));
        int[] arr3 = {6, 7, 2, 6};
        System.out.println(array667(arr3));
    }
}
