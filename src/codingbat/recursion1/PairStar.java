package codingbat.recursion1;

public class PairStar {

    public static String pairStar(String str) {
        if (str.length() == 0) {
            return "";
        }

        if (str.length() == 1) {
            return "" + str.charAt(0);
        }

        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + pairStar(str.substring(1, str.length()));
        }
    }


    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
        System.out.println(pairStar("xxyy"));
        System.out.println(pairStar("aaaa"));
    }
}
