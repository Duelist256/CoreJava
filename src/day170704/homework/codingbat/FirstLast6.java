package day170704.homework.codingbat;

/**
 * Created by Duelist on 04.07.2017.
 */
public class FirstLast6 {
    private static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 6};
        System.out.println(firstLast6(nums));
        nums = new int[]{6, 1, 2, 3};
        System.out.println(firstLast6(nums));
        nums = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(nums));
    }
}
