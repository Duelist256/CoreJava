package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class TripleUp {

    private static boolean tripleUp(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 2] - nums[i + 1] == 1
                    && nums[i + 1] - nums[i] == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 6, 2};
        System.out.println(tripleUp(arr));
        arr = new int[]{1, 2, 3};
        System.out.println(tripleUp(arr));
        arr = new int[]{1, 2, 4};
        System.out.println(tripleUp(arr));
    }
}
