package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class TwoTwo {

    private static boolean twoTwo(int[] nums) {

        int totalTwos = 0;
        int total22 = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                totalTwos++;
                if (nums[i] == nums[i + 1]) {
                    total22++;
                }
            }
        }

        if (nums.length > 0 && nums[nums.length - 1] == 2) {
            totalTwos++;
        }

        return (totalTwos + 1) / 2 == total22;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 2, 3};
        System.out.println(twoTwo(arr));
        arr = new int[]{2, 2, 4};
        System.out.println(twoTwo(arr));
        arr = new int[]{2, 2, 4, 2};
        System.out.println(twoTwo(arr));
        arr = new int[]{4, 2, 2, 2};
        System.out.println(twoTwo(arr));
    }
}
