package day170704.homework.codingbat.array1;

/**
 * Created by Duelist on 05.07.2017.
 */
public class MaxTriple {

    private static int maxTriple(int[] nums) {
        if (nums.length > 1 && nums.length % 2 == 1) {
            int first = nums[0];
            int middle = nums[nums.length / 2];
            int last = nums[nums.length - 1];

            if (first > middle && first > last) {
                return first;
            }

            if (last > first && last > middle) {
                return last;
            }

            return middle;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(maxTriple(arr));
        arr = new int[]{1, 5, 3};
        System.out.println(maxTriple(arr));
        arr = new int[]{5, 2, 3};
        System.out.println(maxTriple(arr));
    }
}
