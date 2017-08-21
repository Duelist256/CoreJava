package day170821;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BinaryOperator;

public class LambdaInMapExamples {
    public static void main(String[] args) {
        Map<String, String> staff = new TreeMap<>();

        staff.put("John", "Boston");
        staff.put("Mary", "New York");
        staff.put("Pete", "Boston");
        staff.put("Ann", "Moscow");
        staff.put("Jane", "Boston");
        staff.put("Harry", "Hogwartz");

        BinaryOperator<String> bop = (s1, s2) -> s2.toUpperCase();

        staff.replaceAll(bop);
        System.out.println(staff);

        staff.computeIfAbsent("Kate", p -> "Paris");
        System.out.println(staff);
        staff.computeIfPresent("Ann", (p1, p2) -> "St. Petersburg");
        System.out.println(staff);
    }
}
