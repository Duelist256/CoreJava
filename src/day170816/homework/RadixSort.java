package day170816.homework;

/**
 * Created by Duelist on 05.07.2017.
 */
public class RadixSort {


    public static int[] sort(int[] nums) {
        int length = nums.length;
        int[] newArray = new int[nums.length];
        final int R = 10;

        int max = findMsx(nums);

        for (int i = 1; max / i > 0; i *= 10) {
            int[] count = new int[R];

            for (int j = 0; j < length; j++) {
                count[(nums[j] / i) % 10]++;
            }

            for (int j = 1; j < R; j++) {
                count[j] += count[j - 1];
            }

            for (int j = length - 1; j >= 0; j--) {
                newArray[count[(nums[j] / i) % 10] - 1] = nums[j];
                count[(nums[j] / i) % 10]--;
            }

            for (int j = 0; j < length; j++) {
                nums[j] = newArray[j];
            }
        }
        return nums;
    }

    private static int findMsx(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    private static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
