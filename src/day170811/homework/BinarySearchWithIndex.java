package day170811.homework;

/**
 * Created by Duelist on 17.08.2017.
 */
public class BinarySearchWithIndex {
    static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;

        int mid = lo + (hi - lo) / 2;
        while (lo <= hi) {
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }

            mid = lo + (hi - lo) / 2;
        }

        return mid;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 10, 15};
        System.out.println(binarySearch(a, -1));
        System.out.println(binarySearch(a, 0));
        System.out.println(binarySearch(a, 17));
        System.out.println(binarySearch(a, 11));
        System.out.println(binarySearch(a, 12));
        System.out.println(binarySearch(a, 6));
    }
}
