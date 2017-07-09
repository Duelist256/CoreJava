package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class Has77 {

    private static boolean has77(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7 &&
                    (nums[i] == nums[i + 1]
                            || nums[i] == nums[i + 2])) {
                return true;

            }

            if (nums[i + 1] == 7 &&
                    (nums[i + 1] == nums[i]
                            || nums[i + 1] == nums[i + 2])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 7};
        System.out.println(has77(arr));
        arr = new int[]{1, 7, 1, 7};
        System.out.println(has77(arr));
        arr = new int[]{1, 7, 1, 1, 7};
        System.out.println(has77(arr));
    }
}
