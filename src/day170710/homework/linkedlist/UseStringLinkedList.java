package day170710.homework.linkedlist;

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

        list.add("twenty");
        list.add("thirty");
        list.add("forty");

        System.out.println("------");
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list.remove(0));
        System.out.println(list);
    }
}
