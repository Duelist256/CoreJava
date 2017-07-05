package day170704.homework.codingbat.array1;

/**
 * Created by Duelist on 05.07.2017.
 */
public class Unlucky1 {

    private static boolean unlucky1(int[] nums) {

        if (nums.length == 2) {
            if (nums[0] == 1 && nums[1] == 3) {
                return true;
            }
        }

        if (nums.length > 2) {
            if (nums[0] == 1 && nums[1] == 3) {
                return true;
            }

            if (nums[1] == 1 && nums[2] == 3) {
                return true;
            }

            if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        System.out.println(unlucky1(arr));
        arr = new int[]{2, 1, 3, 4, 5};
        System.out.println(unlucky1(arr));
        arr = new int[]{1, 1, 1};
        System.out.println(unlucky1(arr));
        arr = new int[]{1, 1};
        System.out.println(unlucky1(arr));
    }
}
