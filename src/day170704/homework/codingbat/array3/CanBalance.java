package day170704.homework.codingbat.array3;

/**
 * Created by Duelist on 15.07.2017.
 */
public class CanBalance {

    private static boolean canBalance(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int anotherSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            anotherSum += nums[i];
            if (anotherSum == sum - anotherSum) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 1};
        System.out.println(canBalance(arr));
        arr = new int[]{2, 1, 1, 2, 1};
        System.out.println(canBalance(arr));
        arr = new int[]{10, 10};
        System.out.println(canBalance(arr));
    }
}
