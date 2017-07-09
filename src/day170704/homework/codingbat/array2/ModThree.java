package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class ModThree {

    private static boolean modThree(int[] nums) {
        int totalOdd = 0;
        int totalEven = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                totalEven++;
            }

            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                totalOdd++;
            }
        }
        return (totalEven > 0 && totalOdd == 0) || (totalEven == 0 && totalOdd > 0);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 5};
        System.out.println(modThree(arr));
        arr = new int[]{2, 1, 2, 5};
        System.out.println(modThree(arr));
        arr = new int[]{2, 4, 2, 5};
        System.out.println(modThree(arr));
        arr = new int[]{1, 2, 1, 2, 1};
        System.out.println(modThree(arr));
    }
}
