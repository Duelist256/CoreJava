package day170704.homework.codingbat.array2;

import java.util.Arrays;

/**
 * Created by Duelist on 09.07.2017.
 */
public class FizzBuzz {

    private static String[] fizzBuzz(int start, int end) {
        String[] newArray = new String[end - start];

        for (int i = 0; i < newArray.length; i++, start++) {
            if (start % 3 == 0 && start % 5 == 0) {
                newArray[i] = "FizzBuzz";
            } else if (start % 3 == 0) {
                newArray[i] = "Fizz";
            } else if (start % 5 == 0) {
                newArray[i] = "Buzz";
            } else {
                newArray[i] = String.valueOf(start);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(1, 6)));
        System.out.println(Arrays.toString(fizzBuzz(1, 8)));
        System.out.println(Arrays.toString(fizzBuzz(1, 11)));
    }
}
