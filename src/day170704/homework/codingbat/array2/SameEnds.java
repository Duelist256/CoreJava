package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class SameEnds {

    private static boolean sameEnds(int[] nums, int len) {
        int start = 0;
        int end = nums.length - len;

        for (int i = 0; i < len; i++) {
            if (nums[start++] != nums[end++]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(arr, 1));
        System.out.println(sameEnds(arr, 2));
        System.out.println(sameEnds(arr, 3));
        arr = new int[]{5, 1, 3, 3};
        System.out.println(sameEnds(arr, 3));
    }
}
