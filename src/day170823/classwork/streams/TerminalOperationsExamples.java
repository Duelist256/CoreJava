package day170823.classwork.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationsExamples {
    public static void main(String[] args) {
        Stream<Double> s1 = Stream.generate(Math::random);
        Stream<Double> s2 = s1.limit(20);

        System.out.println(s1 == s2);

        Optional<Double> minOpt = s2.min(Double::compare);
        Double min = minOpt.orElse(0.0);
        System.out.println(min);
    }
}
