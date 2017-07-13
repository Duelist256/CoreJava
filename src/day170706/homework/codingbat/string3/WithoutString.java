package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 13.07.2017.
 */
public class WithoutString {

    private static String withoutString(String base, String remove) {
        String lowerRemove = remove.toLowerCase();

        int index = base.toLowerCase().indexOf(lowerRemove);
        while (index != -1) {
            base = base.substring(0, index)
                    + base.substring(index + lowerRemove.length(), base.length());

            index = base.toLowerCase().indexOf(lowerRemove);
        }
        return base;
    }

    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
        System.out.println(withoutString("THIS is a FISH", "iS"));
        System.out.println(withoutString("xxx", "xx"));
        System.out.println();

    }
}
