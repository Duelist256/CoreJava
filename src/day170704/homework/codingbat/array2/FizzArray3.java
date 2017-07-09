package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 09.07.2017.
 */
public class FizzArray3 {

    private static int[] fizzArray3(int start, int end) {
        int[] array = new int[end - start];

        for (int i = 0; i < array.length; i++) {
            array[i] = start++;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray3(5, 10)));
        System.out.println(Arrays.toString(fizzArray3(11, 18)));
        System.out.println(Arrays.toString(fizzArray3(1, 3)));
    }
}
