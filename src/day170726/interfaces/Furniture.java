package day170726.interfaces;

abstract public class Furniture implements Cleanable{
    @Override
    public void takeApart() {

    }

    @Override
    public void combine() {

    }
}

interface Cleanable {
    default void clean() {
        takeApart();
        System.out.println("cleaning parts");
        combine();
    }

    void combine();
    void takeApart();
}

class Table extends Furniture {

}

class Chair extends Furniture {

}
