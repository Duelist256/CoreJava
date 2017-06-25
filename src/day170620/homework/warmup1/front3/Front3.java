package day170620.homework.warmup1.front3;

/**
 * Created by Duelist on 24.06.2017.
 */
public class Front3 {
    private static String front3(String str) {
        if (str.length() >= 3) {
            String front = str.substring(0, 3);
            return front + front + front;
        }
        return str + str + str;
    }

    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
    }
}
