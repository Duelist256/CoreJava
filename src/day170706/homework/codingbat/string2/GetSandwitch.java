package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 11.07.2017.
 */
public class GetSandwitch {

    private static String getSandwich(String str) {
        int first = str.indexOf("bread");
        int second = str.lastIndexOf("bread");

        String newStr = "";
        if (second != first) {
            newStr = str.substring(first + 5, second);
        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }
}
