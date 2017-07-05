package day170704.homework.codingbat.array1;

/**
 * Created by Duelist on 04.07.2017.
 */
public class Double23 {

    private static boolean double23(int[] nums) {
        return (nums.length == 2)
                && (nums[0] == 2 || nums[0] == 3)
                && (nums[0] == nums[nums.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {2, 2};
        System.out.println(double23(arr));
        arr = new int[]{3, 3};
        System.out.println(double23(arr));
        arr = new int[]{2, 3};
        System.out.println(double23(arr));
    }
}
