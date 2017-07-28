package package170728.exceptions;

public class DivisionByZero {
    public static void main(String[] args) {
        int result = divide(10, 2);
        System.out.println(result);

        result = divide(10, 0);
    }

    private static int divide(int i, int j) {
        try {
            return i / j;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return Integer.MAX_VALUE;
        }
    }
}
