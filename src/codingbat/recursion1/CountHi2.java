package codingbat.recursion1;

public class CountHi2 {

    public static int countHi2(String str) {

        if (str.length() < 2) {
            return 0;
        }

        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            return countHi2(str.substring(3));
        } else {
            return countHi2(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
    }
}
