package day170704.homework.codingbat.array3;

/**
 * Created by Duelist on 13.07.2017.
 */
public class CountClumps {

    private static int countClumps(int[] nums) {
        int numberOfClumps = 0;
        int prev = Integer.MIN_VALUE;

        if (nums.length > 0 && nums[0] == prev) {
            prev = 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] != prev) {
                numberOfClumps++;
            }
            prev = nums[i];
        }

        return numberOfClumps;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(arr));
        arr = new int[]{1, 1, 2, 1, 1};
        System.out.println(countClumps(arr));
        arr = new int[]{1, 1, 1, 1, 1};
        System.out.println(countClumps(arr));
        arr = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, 2, 3, 1};
        System.out.println(countClumps(arr));
    }
}
