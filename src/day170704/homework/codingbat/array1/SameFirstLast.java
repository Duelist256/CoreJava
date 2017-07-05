package day170704.homework.codingbat.array1;

/**
 * Created by Duelist on 04.07.2017.
 */
public class SameFirstLast {

    private static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sameFirstLast(arr));
        arr = new int[]{1, 2, 3, 1};
        System.out.println(sameFirstLast(arr));
        arr = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(arr));
    }
}
