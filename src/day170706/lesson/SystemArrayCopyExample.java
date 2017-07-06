package day170706.lesson;

import java.util.Arrays;

/**
 * Created by Duelist on 06.07.2017.
 */
public class SystemArrayCopyExample {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] ints = Arrays.copyOf(a, a.length);
        return;
    }
}
