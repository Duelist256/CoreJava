package day170731;

public class FinallyExample2 {
    public static void main(String[] args) {
        int r = get();
        System.out.println(r);
    }

    private static int get() {
        try {
            return 0;
        } finally {
            return 20;
        }
    }
}
