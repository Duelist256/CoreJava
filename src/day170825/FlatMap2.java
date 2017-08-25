package day170825;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlatMap2 {
    public static void main(String[] args) {
        List<String> empty = Arrays.asList();
        List<String> list1 = Arrays.asList("one", "two", "three");
        List<String> list2 = Arrays.asList("один", "два", "три");
        // unite these lists

        Stream<List<String>> streamOfLists = Stream.of(list1, empty, list2);

//        Stream<Stream<String>> streamStream = streamOfLists.map(list -> list.stream());

        Stream<String> streamOfStrings = streamOfLists.flatMap(Collection::stream);
        List<String> words = streamOfStrings.collect(toList());
        System.out.println(words);
    }

}
