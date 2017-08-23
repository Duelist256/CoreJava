package day170823.streams;

import java.util.stream.Stream;

public class Print20EvenNumbers {
    public static void main(String[] args) {

        Stream.iterate(0, n -> n + 2).limit(20).forEach(System.out::println);

    }
}
