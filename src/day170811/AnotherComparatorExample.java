package day170811;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnotherComparatorExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Pete", "USA"));
        list.add(new Person("Петя", "Россия"));
        list.add(new Person("Мыкола", "Беларусь"));
        list.add(new Person("Гога", "Грузия"));
        list.add(new Person("John", "USA"));
        list.add(new Person("Вася", "Россия"));
        list.add(new Person("Гамлет", "Грузия"));

        System.out.println(list);
        list.sort(new CompareByName());
        list.sort(new CompareByCountry());
        System.out.println(list);
    }
}

class CompareByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

class CompareByCountry implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.country.compareTo(o2.country);
    }
}

class Person {
    String name;
    String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " : " + name;
    }
}
