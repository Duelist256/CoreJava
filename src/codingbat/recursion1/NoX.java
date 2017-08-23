package codingbat.recursion1;

public class NoX {

    public static String noX(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.charAt(0) != 'x') {
            return str.charAt(0) + noX(str.substring(1, str.length()));
        } else {
            return noX(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }
}
