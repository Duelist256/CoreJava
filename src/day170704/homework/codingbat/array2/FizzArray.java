package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 08.07.2017.
 */
public class FizzArray {

    private static int[] fizzArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(4)));
        System.out.println(Arrays.toString(fizzArray(1)));
        System.out.println(Arrays.toString(fizzArray(10)));
    }
}
