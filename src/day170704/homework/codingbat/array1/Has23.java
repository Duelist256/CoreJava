package day170704.homework.codingbat.array1;

/**
 * Created by Duelist on 04.07.2017.
 */
public class Has23 {

    private static boolean has23(int[] nums) {
        return nums.length == 2 &&
                (nums[0] == 2 || nums[0] == 3 ||
                        nums[nums.length - 1] == 2 || nums[nums.length - 1] == 3);
    }


    public static void main(String[] args) {
        int[] arr = {2, 5};
        System.out.println(has23(arr));
        arr = new int[]{4, 3};
        System.out.println(has23(arr));
        arr = new int[]{4, 5};
        System.out.println(has23(arr));
    }
}
