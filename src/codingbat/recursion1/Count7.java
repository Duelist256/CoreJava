package codingbat.recursion1;

public class Count7 {

    public static int count7(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
    }
}
