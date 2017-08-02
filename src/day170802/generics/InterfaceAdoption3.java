package day170802.generics;

public class InterfaceAdoption3 {
    public static void main(String[] args) {
        Cleaning<String> c = new Cleaner<>();
        c.clean("one");
//        c.clean(1); Compile error
        Cleaning c2 = c;
        c2.clean(1);

        c2 = new StringCleaner();
        c2.clean(1);
    }
}

interface Cleaning<T> {
    void clean(T t);
}

class StringCleaner implements Cleaning<String> {
    @Override
    public void clean(String s) {
        System.out.println("cleaning " + s);
    }
}

class Cleaner<T> implements Cleaning<T> {

    @Override
    public void clean(T t) {
        System.out.println("cleaning " + t);
    }
}