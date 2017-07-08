package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 08.07.2017.
 */
public class Has22 {

    private static boolean has22(int[] nums) {
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 2 && nums[i] == nums[i + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2};
        System.out.println(has22(arr));
        arr = new int[]{1, 2, 1, 2};
        System.out.println(has22(arr));
        arr = new int[]{2, 1, 2};
        System.out.println(has22(arr));
    }
}
