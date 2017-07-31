package day170731;

public class OverridingThrowsExamples {

    static class MyException extends Exception {

    }

    static class A {
        public void m() throws MyException{

        }
    }

    static class B extends A {
        @Override
        public void m() {

        }
    }

    static class C extends A {
        @Override
        public void m() throws MyException {

        }
    }
}
