package day170825;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMapExample {

    public static void main(String[] args) {

        String[] words = {"hello", "world"};

        // unique letters: h e l o w r d


//        Stream<String> stream = Arrays.stream(words);
//
//        Stream<String[]> stringArrays = stream.map(s -> s.split(""));
//
////        Stream<Stream<String>> map = stringArrays.map(Arrays::stream);
//        Stream<String> streamOfLetters = stringArrays.flatMap(Arrays::stream);
//        List<String> distinctLetters = streamOfLetters.distinct().collect(toList());
//
//        System.out.println(distinctLetters);


//        Stream<Stream<String>> map = stringArrays.map(Arrays::stream);
        List<String> distinctLetters = Arrays.stream(words).map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(toList());

        System.out.println(Arrays.stream(words).map(s -> s.split(""))
                .flatMap(Arrays::stream).distinct()
                .collect(toList()));
    }
}
