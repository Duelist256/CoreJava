package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class isEverywhere {

    private static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3};
        System.out.println(isEverywhere(arr, 1));
        System.out.println(isEverywhere(arr, 2));
        arr = new int[]{1, 2, 1, 3, 4};
        System.out.println(isEverywhere(arr, 1));
    }
}
