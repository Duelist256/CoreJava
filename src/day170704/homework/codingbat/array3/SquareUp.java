package day170704.homework.codingbat.array3;

import java.util.Arrays;

/**
 * Created by Duelist on 08.07.2017.
 */
public class SquareUp {
    private static int[] squareUp(int n) {
        int[] array = new int[n * n];

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                int index = n * i - 1 - j;
                array[index] = 1 + j;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(3)));
        System.out.println(Arrays.toString(squareUp(2)));
        System.out.println(Arrays.toString(squareUp(4)));
        System.out.println(Arrays.toString(squareUp(1)));
    }
}
