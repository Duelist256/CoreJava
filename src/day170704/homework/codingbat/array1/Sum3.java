package day170704.homework.codingbat.array1;

/**
 * Created by Duelist on 04.07.2017.
 */
public class Sum3 {
    private static int sum3(int[] nums) {
        int sum = 0;
        if (nums.length == 3) {
            for (int num : nums) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sum3(arr));
        arr = new int[]{5, 11, 2};
        System.out.println(sum3(arr));
        arr = new int[]{7, 0, 0};
        System.out.println(sum3(arr));
    }
}
