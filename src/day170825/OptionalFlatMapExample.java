package day170825;

import java.util.Optional;

public class OptionalFlatMapExample {

    public static void main(String[] args) {
        String s = null;

        Optional<String> ofString = Optional.ofNullable(s);
        Optional<Integer> opInteger = ofString.map(String::length);

    }
}
