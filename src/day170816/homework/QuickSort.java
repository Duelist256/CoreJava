package day170816.homework;

/**
 * Created by Duelist on 20.08.2017.
 */
public class QuickSort {
    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        while (true) {
            while (a[++i] < (a[lo])) {
                if (i == hi) {
                    break;
                }
            }

            while (a[lo] < a[--j]) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void sort(int[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(arr, lo, hi);
        sort(arr, lo, j - 1);
        sort(arr, j + 1, hi);
    }

    public static void sort(int[] arr) {
        // todo shuffle
        sort(arr, 0, arr.length - 1);
    }
}
