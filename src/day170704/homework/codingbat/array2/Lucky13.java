package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 08.07.2017.
 */
public class Lucky13 {

    private static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 4};
        System.out.println(lucky13(arr));
        arr = new int[]{1, 2, 3};
        System.out.println(lucky13(arr));
        arr = new int[]{1, 2, 4};
        System.out.println(lucky13(arr));
    }
}
