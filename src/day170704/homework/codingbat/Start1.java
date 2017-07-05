package day170704.homework.codingbat;

/**
 * Created by Duelist on 05.07.2017.
 */
public class Start1 {

    private static int start1(int[] a, int[] b) {
        int count = 0;

        for (int num : a) {
            if (num == 1) {
                count++;
            }
        }

        for (int num : b) {
            if (num == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 3};
        System.out.println(start1(arr1, arr2));
        arr1 = new int[]{7, 2, 3};
        arr2 = new int[]{1};
        System.out.println(start1(arr1, arr2));
        arr1 = new int[]{1, 2};
        arr2 = new int[]{};
        System.out.println(start1(arr1, arr2));
    }
}
