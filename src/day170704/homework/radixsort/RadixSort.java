package day170704.homework.radixsort;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] array1 = DataGenerator.generate(1000000);
        int[] array2 = Arrays.copyOf(array1, array1.length);

        long startTime = System.nanoTime();
        sort(array1);
        long endTime = System.nanoTime();
        System.out.println("Radix sort (LSD) - " + (endTime - startTime) / 1000000);

        startTime = System.nanoTime();
        Arrays.sort(array2);
        endTime = System.nanoTime();
        System.out.println("Arrays.sort() - " + (endTime - startTime) / 1000000);
    }
}
