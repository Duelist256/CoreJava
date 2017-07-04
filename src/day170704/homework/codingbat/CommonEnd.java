package day170704.homework.codingbat;

/**
 * Created by Duelist on 04.07.2017.
 */
public class CommonEnd {

    private static boolean commonEnd(int[] a, int[] b) {
        return a.length >= 1 && b.length >= 1 && (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 3};
        System.out.println(commonEnd(arr1, arr2));
        arr2 = new int[]{7, 3, 2};
        System.out.println(commonEnd(arr1, arr2));
        arr2 = new int[]{1, 3};
        System.out.println(commonEnd(arr1, arr2));
    }
}
