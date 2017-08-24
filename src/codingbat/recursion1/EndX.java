package codingbat.recursion1;

public class EndX {

    public static String endX(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.charAt(0) == 'x') {
            return endX(str.substring(1, str.length())) + 'x';
        } else {
            return str.charAt(0) + endX(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
    }
}
