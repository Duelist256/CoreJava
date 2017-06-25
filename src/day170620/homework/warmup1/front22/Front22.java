package day170620.homework.warmup1.front22;

/**
 * Created by Duelist on 25.06.2017.
 */
public class Front22 {

    private static String front22(String str) {
        int strLength = str.length();
        if (strLength < 2) {
            return str + str + str;
        }
        String front = str.substring(0, 2);
        return front + str + front;
    }

    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        System.out.println(front22("a"));
        System.out.println(front22("aaaa"));
    }
}
