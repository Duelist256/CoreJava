package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class TwoTwo {

    private static boolean twoTwo(int[] nums) {

        boolean has22 = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 2) {
                if (nums[i] == 2) {
                    has22 = true;
                } else {
                    has22 = false;
                }
            }
        }

        return has22;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 2, 3};
        System.out.println(twoTwo(arr));
        arr = new int[]{2, 2, 4};
        System.out.println(twoTwo(arr));
        arr = new int[]{2, 2, 4, 2};
        System.out.println(twoTwo(arr));
    }
}
