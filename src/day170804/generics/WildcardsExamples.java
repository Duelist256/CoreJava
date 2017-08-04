package day170804.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsExamples {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.2, 2.4, 3.6);

//        List<Number> numbers = integers; Compile Error

        printNumbers(integers);
        printNumbers(doubles);

        List<Number> numbers = new ArrayList<>();
        List<Integer> integers2;
        fill(numbers);
//        fill(integers2);
    }

    private static void fill(List<? super Number> numbers) { // Lower Bound, Store is allowed
        numbers.add(1.36);
        numbers.add(1);
        numbers.add(1L);
        Object object = numbers.get(1);
    }

    private static void printNumbers(List<? extends Number> nums) { // Upper bound, Extract is allowed
        for (Number number : nums) {
            System.out.println(number);
        }

//        nums.add(1.45); store is forbidden
    }

}
