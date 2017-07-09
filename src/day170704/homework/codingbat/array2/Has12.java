package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class Has12 {

    private static boolean has12(int[] nums) {
        boolean has1 = false;
        boolean has2 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                has1 = true;
            }

            if (has1 && nums[i] == 2) {
                has2 = true;
            }
        }
        return has1 && has2;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2};
        System.out.println(has12(arr));
        arr = new int[]{3, 1, 2};
        System.out.println(has12(arr));
        arr = new int[]{3, 1, 4, 5, 2};
        System.out.println(has12(arr));
    }
}
