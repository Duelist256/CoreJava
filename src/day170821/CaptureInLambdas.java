package day170821;

public class CaptureInLambdas {
    public static void main(String[] args) {
        X x = new X();
        x.m(30);
    }
}

class X {
    static int classField = 30;

    int instanceField;

    void m(int formalParameter) {
        int localVariable = 10;

        Runnable r = () -> {
            System.out.println(localVariable + formalParameter + instanceField + classField);
            instanceField = 0;
            classField = 0;
//            localVariable = 0;    // compile error
//            formalParameter = 0;  // compile error
        };

        r.run();
    }
}