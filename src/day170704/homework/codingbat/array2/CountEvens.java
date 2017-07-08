package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 07.07.2017.
 */
public class CountEvens {

    private static int countEvens(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 2, 3, 4};
        System.out.println(countEvens(arr));
        arr = new int[]{2, 2, 0};
        System.out.println(countEvens(arr));
        arr = new int[]{1, 3, 5};
        System.out.println(countEvens(arr));
    }
}
