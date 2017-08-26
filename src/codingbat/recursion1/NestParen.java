package codingbat.recursion1;

public class NestParen {

    public static boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        }

        while (str.charAt(0) != '(') {

            if (str.length() == 1) {
                return false;
            }

            return nestParen(str.substring(1));
        }

        while (str.charAt(str.length() - 1) != ')') {

            if (str.length() == 1) {
                return false;
            }

            return nestParen(str.substring(0, str.length() - 1));
        }

        return nestParen(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
    }
}
