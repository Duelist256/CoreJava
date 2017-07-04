package day170704.lesson;

import java.util.Arrays;

/**
 * Created by Duelist on 04.07.2017.
 */
public class SquareUp {
    public static int[] squareUp(int n) {
        int[] arr = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[j] = n - i;
            }
        }
        System.out.println(Arrays.toString(arr));
        return null;
    }

    public static void main(String[] args) {
        squareUp(4);
        Arrays.sort(new int[4]);
    }
}
