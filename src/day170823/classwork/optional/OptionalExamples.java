package day170823.classwork.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalExamples {

    final static Random r = new Random();

    public static void main(String[] args) {

        Optional<String> optional = compute();

        String s = optional.orElse(getDefaultValue());
        String s2 = optional.orElseGet(OptionalExamples::getDefaultValue);

    }

    private static String getDefaultValue() {
        return null;
    }

    public static Optional<String> compute() {
        return Optional.ofNullable(r.nextBoolean() ? "hello" : null);
    }

}
