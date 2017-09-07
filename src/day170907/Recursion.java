package day170907;

public class Recursion {
    public static void main(String[] args) {
        print(1, 10);
        System.out.println();
        printFrom1To(10);
        System.out.println();
//        printFromTo1(10);
    }

    private static void printFrom1To(int end) {
        if (end < 1) {
            return;
        }
        printFrom1To(end - 1);
        System.out.print(" " + end); // tail recursion
    }

//    private static void printFromTo1(int start) {
//        if (start < 0) {
//            return;
//        }
//        System.out.print(" " + start);
//        printFrom1To(start - 1);
//    }

    private static void print(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(" " + start);
        print(start + 1, end); // tail recursion
    }
}
