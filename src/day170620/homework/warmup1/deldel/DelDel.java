package day170620.homework.warmup1.deldel;

/**
 * Created by Duelist on 24.06.2017.
 */
public class DelDel {
    private static String delDel(String str) {
        int strLength = str.length();

        if ((strLength > 3) && (str.substring(1, 4).equals("del"))) {
            return str.charAt(0) + str.substring(4, strLength);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }
}
