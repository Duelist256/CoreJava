package day170704.homework.codingbat.array3;

/**
 * Created by Duelist on 12.07.2017.
 */
public class MaxMirror {
    private static int maxMirror(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int maxLength = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (count + i < nums.length && nums[i + count] == nums[j]) {
                    count++;
                } else if (count != 0) {
                    maxLength = Math.max(count, maxLength);
                    count = 0;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 4}; // 3
        System.out.println(maxMirror(arr));
        arr = new int[]{1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println(maxMirror(arr));
        arr = new int[]{1, 1, 2, 3, 9, 4, 7, 1, 3, 8, 9, 3, 2, 1}; // 4
        System.out.println(maxMirror(arr));
        arr = new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}; // 4
        System.out.println(maxMirror(arr));
        arr = new int[]{7, 1, 2, 9, 7, 2, 1};
        System.out.println(maxMirror(arr));
        arr = new int[]{7};
        System.out.println(maxMirror(arr));

    }
}
