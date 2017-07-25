package day170724.nested;

public class AnonymousExamples {

    interface Operation {
        int apply(int a, int b);
    }

    static class Addition implements Operation {

        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    }

    static class Multiplication implements Operation {

        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {

        int result = process(new Addition(), 10, 20);
        System.out.println(result);
        result = process(new Multiplication(), 10, 20);
        System.out.println(result);

        // anonymous class
        result = process(new Operation() {
            @Override
            public int apply(int a, int b) {
                return a % b;
            }
        }, 42, 10);
        System.out.println(result);

        result = process(((a, b) -> a / b), 40, 10);
        System.out.println(result);


        // local class
        class Subtraction implements Operation {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        }
        result = process(new Subtraction(), 40, 10);
        System.out.println(result);
    }

    private static int process(Operation op, int i, int j) {
        return op.apply(i, j);
    }
}
