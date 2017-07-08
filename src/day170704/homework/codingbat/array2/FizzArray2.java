package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 08.07.2017.
 */
public class FizzArray2 {

    private static String[] fizzArray2(int n) {
        String[] array = new String[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray2(4)));
        System.out.println(Arrays.toString(fizzArray2(10)));
        System.out.println(Arrays.toString(fizzArray2(2)));
    }
}
