package codingbat.recursion1;

public class StringClean {

    public static String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.charAt(0) != str.charAt(1)) {
            return str.charAt(0) + stringClean(str.substring(1));
        } else {
            return stringClean(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("Hello"));
    }
}
