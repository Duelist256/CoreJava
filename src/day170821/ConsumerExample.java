package day170821;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> stringConsumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> stringConsumer2 = s -> System.out.println(s);
        Consumer<String> stringConsumer3 = System.out::println;

        stringConsumer3.accept("hello world");

        Map<String, Integer> map = new HashMap<>();

        BiConsumer<String, Integer> biConsumer1 = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                map.put(key, value);
            }
        };

        BiConsumer<String, Integer> biConsumer2 = (key, value) -> map.put(key, value);

        BiConsumer<String, Integer> biConsumer3 = map::put;

        biConsumer3.accept("hello", 3);
    }
}
