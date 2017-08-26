package codingbat.recursion1;

public class ParenBit {

    public static String parenBit(String str) {

        if (str.length() == 0) {
            return "";
        }

        while (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }

        while (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));
    }
}
