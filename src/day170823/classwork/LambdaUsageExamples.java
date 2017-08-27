package day170823.classwork;

import java.util.ArrayList;
import java.util.List;

public class LambdaUsageExamples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Boston");
        list.add("Moscow");
        list.add("Alma-ata");

        System.out.println(list);

//        for (String s : list) {
//            System.out.println(s);
//        }
//
//        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
        list.removeIf(s -> s.length() > 6);
        System.out.println(list);
    }
}
