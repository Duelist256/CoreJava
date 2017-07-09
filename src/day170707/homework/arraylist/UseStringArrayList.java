package day170707.homework.arraylist;

/**
 * Created by Duelist on 07.07.2017.
 */
public class UseStringArrayList {
    public static void main(String[] args) {

        StringArrayList list = new StringArrayList();

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

        list.remove("three");
        System.out.println(list);

        list.set(0, "four");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println(list.isEmpty());

        list.remove(0);
        list.remove(0);
        System.out.println(list.isEmpty());
    }
}
