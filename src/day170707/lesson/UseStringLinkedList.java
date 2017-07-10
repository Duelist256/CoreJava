package day170707.lesson;

import day170710.lesson.StringLinkedList;

/**
 * Created by Duelist on 10.07.2017.
 */
public class UseStringLinkedList {
    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);
        System.out.println(list.remove("two"));
        System.out.println(list);
        System.out.println(list.remove("two"));
        System.out.println(list);
        System.out.println(list.remove("one"));
        System.out.println(list.remove("three"));
        System.out.println(list);
    }
}
