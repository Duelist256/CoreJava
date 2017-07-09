package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 09.07.2017.
 */
public class HaveThree {

    private static boolean haveThree(int[] nums) {
        int count = 0;
        boolean has33 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {
                count++;

                if (nums[i] == nums[i + 1]) {
                    has33 = true;
                }
            }
        }

        if (nums.length > 0 && nums[nums.length - 1] == 3) {
            count++;
        }

        return count == 3 && !has33;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 3, 1, 3};
        System.out.println(haveThree(arr));
        arr = new int[]{3, 1, 3, 3};
        System.out.println(haveThree(arr));
        arr = new int[]{3, 4, 3, 3, 4};
        System.out.println(haveThree(arr));
    }
}
