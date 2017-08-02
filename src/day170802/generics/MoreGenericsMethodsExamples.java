package day170802.generics;

public class MoreGenericsMethodsExamples {
    public static void main(String[] args) {
        Example.staticMethod("one");
        Example.staticMethod(1);
        Example.staticMethod(new Object());

        System.out.println();

        Example<String> ex = new Example<>();
        ex.instanceMethod("one");
        ex.instanceMethod(1);
        ex.instanceMethod(MoreGenericsMethodsExamples.class);
    }
}

class Example<T> {

//    static T x; Compile Error

    public static <M> void staticMethod(M m) {
        System.out.println(m);
    }

    public <N> void instanceMethod(N n) {
        System.out.println(n);
    }
}
