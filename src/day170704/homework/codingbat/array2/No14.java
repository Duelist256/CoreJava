package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 08.07.2017.
 */
public class No14 {

    private static boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;

        if (nums.length >= 2) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    has1 = true;
                }

                if (nums[i] == 4) {
                    has4 = true;
                }
            }
            return has1 ^ has4;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(no14(arr));
        arr = new int[]{1, 2, 3, 4};
        System.out.println(no14(arr));
        arr = new int[]{2, 3, 4};
        System.out.println(no14(arr));
    }
}
