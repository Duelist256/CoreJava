package day170802.generics;

import java.util.ArrayList;
import java.util.List;

public class PreGenericsExamples {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add(1);
        list.add(null);
        list.add(new PreGenericsExamples());

        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        List strings = new ArrayList();

        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add(1);

        for (Object obj : strings) {
            if (obj instanceof String) {
                String s = (String) obj;
                System.out.println(s.length());
            }
        }
    }
}
