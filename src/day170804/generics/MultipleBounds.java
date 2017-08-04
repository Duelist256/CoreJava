package day170804.generics;

public class MultipleBounds {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        process(a);
        process(b);
    }

    static <T extends X & Y> void process(T thing) {
        thing.x();
        thing.y();
    }

}

interface X {
    void x();
}

interface Y {
    void y();
}

interface Z extends X, Y {
}

class A implements X, Y {

    @Override
    public void x() {

    }

    @Override
    public void y() {

    }
}

class B implements X, Y {

    @Override
    public void x() {

    }

    @Override
    public void y() {

    }
}
