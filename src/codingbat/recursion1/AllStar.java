package codingbat.recursion1;

public class AllStar {

    public static String allStar(String str) {
        if (str.length() == 0) {
            return "";
        }

        if (str.length() == 1) {
            return "" + str.charAt(0);
        }

        return str.charAt(0) + "*" + allStar(str.substring(1, str.length()));
    }

    public static void main(String[] args) {
        System.out.println(allStar("hello"));
    }
}
