package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class MatchUp {

    private static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff > 0 && diff <= 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{2, 3, 10};
        System.out.println(matchUp(arr1, arr2));
        arr2 = new int[]{2, 3, 5};
        System.out.println(matchUp(arr1, arr2));
        arr2 = new int[]{2, 3, 3};
        System.out.println(matchUp(arr1, arr2));
    }
}
