package day170823.classwork.streams;

import java.util.stream.Stream;

public class MapExamples {
    public static void main(String[] args) {
        Stream.of("b", "a", "n", "a", "n", "a").map(s -> s.toUpperCase())
                .forEach(System.out::print);

        System.out.println();

        Stream.of("b", "a", "n", "a", "n", "a").map(String::toUpperCase)
                .forEach(System.out::print);

        System.out.println();

        Stream.of("b", "a", "n", "a", "n", "a").map(s -> s.length())
                .forEach(System.out::print);

        System.out.println();

        Stream.of("b", "a", "n", "a", "n", "a").map(String::length)
                .forEach(System.out::print);

        System.out.println();
    }
}
