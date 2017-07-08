package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 08.07.2017.
 */
public class Sum67 {

    private static int sum67(int[] nums) {
        int sum = 0;
        boolean startCounting = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                startCounting = false;
            }

            if (nums[i] == 7) {
                if (!startCounting) {
                    startCounting = true;
                    continue;
                }

            }

            if (startCounting) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2};
        System.out.println(sum67(arr));
        arr = new int[]{1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(arr));
        arr = new int[]{1, 1, 6, 7, 2};
        System.out.println(sum67(arr));
        arr = new int[]{2, 7, 6, 2, 6, 7, 2, 7};
        System.out.println(sum67(arr));

    }
}
