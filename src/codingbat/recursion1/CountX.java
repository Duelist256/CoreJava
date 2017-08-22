package codingbat.recursion1;

public class CountX {

    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1, str.length()));
        } else {
            return countX(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        // 97 122
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));
    }
}
