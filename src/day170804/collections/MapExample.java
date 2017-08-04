package day170804.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        fill(phonebook);
        System.out.println(phonebook);

        Map<String, String> phonebook2 = new LinkedHashMap<>();
        fill(phonebook2);
        System.out.println(phonebook2);

        Map<String, String> phonebook3 = new TreeMap<>();
        fill(phonebook3);
        System.out.println(phonebook3);
    }


    private static void fill(Map<String, String> phonebook) {
        phonebook.put("Pete", "1-231-213-12-31-1");
        phonebook.put("John", "7-231-213-12-31-1");
        phonebook.put("Mary", "8-231-213-12-31-1");
        phonebook.put("Pete", "5-231-213-12-31-1");
    }
}
