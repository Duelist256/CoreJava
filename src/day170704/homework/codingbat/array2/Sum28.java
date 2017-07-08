package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 08.07.2017.
 */
public class Sum28 {

    private static boolean sum28(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        return sum == 8;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 2, 2, 4, 2};
        System.out.println(sum28(arr));
        arr = new int[]{2, 3, 2, 2, 4, 2, 2};
        System.out.println(sum28(arr));
        arr = new int[]{1, 2, 3, 4};
        System.out.println(sum28(arr));
    }
}
