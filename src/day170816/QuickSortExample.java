package day170816;

import java.util.Arrays;
import java.util.List;

public class QuickSortExample {
    public static Comparable[] sort(Comparable[] a) {
        List<Comparable> list = Arrays.asList(a);
        a = (Comparable[]) list.toArray();

        sort(a, 0, a.length - 1);

        return a;
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo]))
                if (i == hi) break;
            while (less(a[lo], a[--j]))
                if (j == lo) break;

            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static void exch(Comparable[] a, int lo, int j) {
        Comparable temp = a[lo];
        a[lo] = a[j];
        a[j] = temp;
    }

    private static boolean less(Comparable c1, Comparable c2) {
        return c1.compareTo(c2) < 0;
    }

    public static void main(String[] args) {
        Character[] arr = {'t', 'd', 'e', 'a', 'b', 'c'};
        Character[] sortedArr1 = (Character[]) sort(arr);
        System.out.println(Arrays.toString(sortedArr1));

        Integer[] arr2 = {3, 0, 2, 1, 6, 7};
        Integer[] sortedArr2 = (Integer[]) sort(arr2);
        System.out.println(Arrays.toString(sortedArr2));

        String[] arr3 = {"elem1", "elem2", "elem0", "elem9", "elem6", "elem5"};
        String[] sortedArr3 = (String[]) sort(arr3);
        System.out.println(Arrays.toString(sortedArr3));
    }
}
