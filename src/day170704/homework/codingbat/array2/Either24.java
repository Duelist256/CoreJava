package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class Either24 {

    private static boolean either24(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (nums[i] == 2) {
                    has22 = true;
                }

                if (nums[i] == 4) {
                    has44 = true;
                }
            }
        }
        return has22 ^ has44;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2};
        System.out.println(either24(arr));
        arr = new int[]{4, 4, 1};
        System.out.println(either24(arr));
        arr = new int[]{4, 4, 1, 2, 2};
        System.out.println(either24(arr));
    }
}
