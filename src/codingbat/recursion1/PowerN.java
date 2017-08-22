package codingbat.recursion1;

public class PowerN {

    public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return base;
        } else {
            return base * powerN(base, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(powerN(3, 0));
        System.out.println(powerN(3, 1));
        System.out.println(powerN(3, 2));
        System.out.println(powerN(3, 3));
    }
}
