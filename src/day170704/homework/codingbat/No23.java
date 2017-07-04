package day170704.homework.codingbat;

/**
 * Created by Duelist on 04.07.2017.
 */
public class No23 {

    private static boolean no23(int[] nums) {
        return nums.length == 2 &&
                (nums[0] != 2 && nums[0] != 3 &&
                        nums[nums.length - 1] != 2 && nums[nums.length - 1] != 3);
    }


    public static void main(String[] args) {
        int[] arr = {4, 5};
        System.out.println(no23(arr));
        arr = new int[]{4, 2};
        System.out.println(no23(arr));
        arr = new int[]{3, 5};
        System.out.println(no23(arr));
    }
}
