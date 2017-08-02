package day170802.generics;

public class InterfaceAdoptionUsingGenericsExample {

}


class D extends A {

}

class E extends A {

}

class Z implements Makeable<D> {
    @Override
    public void doSomethingWith(D a) {

    }
}

class W implements Makeable<String> {
    @Override
    public void doSomethingWith(String a) {

    }
}

class S implements Makeable<A> {
    @Override
    public void doSomethingWith(A a) {

    }
}

interface Makeable<T> {
    void doSomethingWith(T a);
}
