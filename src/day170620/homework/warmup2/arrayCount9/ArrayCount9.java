package day170620.homework.warmup2.arrayCount9;

/**
 * Created by Duelist on 26.06.2017.
 */
public class ArrayCount9 {
    private static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i: nums) {
            if (i == 9)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 9};
        System.out.println(arrayCount9(arr1));
        int[] arr2 = {1, 9, 9};
        System.out.println(arrayCount9(arr2));
        int[] arr3 = {1, 9, 9, 3, 9};
        System.out.println(arrayCount9(arr3));
    }
}
