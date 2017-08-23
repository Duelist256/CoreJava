package day170823.streams;

import java.util.HashSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CollectExamples {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("b", "a", "n", "a", "n", "a");

        Supplier<StringBuilder> sbSupplier = StringBuilder::new;
        BiConsumer<StringBuilder, String> accumulator = StringBuilder::append;
        BiConsumer<StringBuilder, StringBuilder> consumer = StringBuilder::append;

        StringBuilder stringBuilder = stream.collect(sbSupplier, accumulator, consumer);
        System.out.println(stringBuilder.toString());

        Stream<String> stream2 = Stream.of("b", "a", "n", "a", "n", "a");
        HashSet<String> letters = stream2.collect(HashSet::new, HashSet::add, HashSet::addAll);
        System.out.println(letters);
    }
}
