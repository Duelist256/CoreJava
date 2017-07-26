package day170726.linkedlistiterator;

import java.util.Iterator;

public class UseListWithIterator {
    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();

        list.add("one");
        list.add("two");
        list.add("three");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String elem: list) {
            System.out.println(elem);
        }
    }
}
