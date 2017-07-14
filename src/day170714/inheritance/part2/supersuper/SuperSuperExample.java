package day170714.inheritance.part2.supersuper;

/**
 * Created by Duelist on 14.07.2017.
 */
public class SuperSuperExample {

    static class A {
        void m() {
            System.out.println("one");
        }
    }

    static class B extends A {
        @Override
        void m() {
            System.out.println("two");
        }

        void x() {
            super.m();
        }
    }

    static class C extends B {
        @Override
        void m() {
            x(); // super.super.m()
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.m();
        B b = new B();
        b.m();
        C c = new C();
        c.m();

    }
}
