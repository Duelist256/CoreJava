package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 08.07.2017.
 */
public class More14 {

    private static boolean more14(int[] nums) {
        int sum1 = 0;
        int sum4 = 0;

        for (int num : nums) {
            if (num == 1) {
                sum1++;
            }

            if (num == 4) {
                sum4++;
            }
        }
        return sum1 > sum4;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 1};
        System.out.println(more14(arr));
        arr = new int[]{1, 4, 1, 4};
        System.out.println(more14(arr));
        arr = new int[]{1, 1};
        System.out.println(more14(arr));
    }
}
