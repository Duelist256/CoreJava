package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 08.07.2017.
 */
public class Sum13 {

    private static int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 1};
        System.out.println(sum13(arr));
        arr = new int[]{1, 1};
        System.out.println(sum13(arr));
        arr = new int[]{1, 2, 2, 1, 13};
        System.out.println(sum13(arr));
        arr = new int[]{1, 2, 13, 2, 1, 13};
        System.out.println(sum13(arr));
    }
}
