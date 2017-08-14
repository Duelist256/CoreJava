package day170814;

import java.util.Arrays;

public class MergeSortExample {

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        System.out.println(Arrays.toString(a) + " " + lo + ", " + hi);

        if (hi <= lo)
            return;

        int mid = lo + (hi - lo) / 2;

        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);

        System.out.println("Merged: " + Arrays.toString(a) + " " + lo + ", " + hi);
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0)
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }

    // 10 20 5 2 10 2 3 4

    // 10 10 2 3 4 20 5 2


    //       |
    // 10 20 5 2 10 2 3 4
    // 5 2 10 10 2 3 4 20

    public static void main(String[] args) {
        Integer[] a = {10, 20, 5, 2, 10, 2, 3, 4};
        Integer[] aux = new Integer[a.length];

        merge(a, aux, 0, 1, a.length - 1);
        System.out.println(Arrays.toString(a));

        System.out.println();
        ;
        Integer[] a2 = {50, 40, 10, 20, 30, 0};
        sort(a2);

    }
}
