package day170704.homework.codingbat.array2;

/**
 * Created by Duelist on 08.07.2017.
 */
public class Only14 {

    private static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 1, 4};
        System.out.println(only14(arr));
        arr = new int[]{1, 4, 2, 4};
        System.out.println(only14(arr));
        arr = new int[]{1, 1};
        System.out.println(only14(arr));
    }
}
