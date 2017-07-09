package day170707.homework.arraylist;

/**
 * Created by Duelist on 07.07.2017.
 */
public class UseStringArrayList {
    public static void main(String[] args) {

        StringArrayList list = new StringArrayList();

        list.add("one");
        System.out.println(list);

        list.add("two");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.add("three");
        System.out.println(list);

        list.add("four");
        list.add("five");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
