package codingbat.recursion1;

public class CountHi {

    public static int countHi(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return 0;
        } else if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2, str.length()));
        } else {
            return countHi(str.substring(1, str.length()));
        }
    }

    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
    }
}
