package day170821;

public class LambdaInsteadOfAnonymousDemo {

    public static void main(String[] args) {

        Runnable procedure = () -> System.out.println("hello, world");

        Runnable procedure2 = () -> System.out.println("world, hello!!1 " + procedure);

        process(procedure);
        process(procedure2);

        algorithm(procedure, procedure2);

    }

    private static void algorithm(Runnable step1, Runnable step2) {
        step1.run();
        step2.run();
    }

    private static void process(Runnable procedure) {
        procedure.run();
    }
}
