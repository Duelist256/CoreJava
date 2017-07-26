package day170726;

public interface Special {
    Special special = new Special() {
        @Override
        public void doSomethingExceptional() {
            System.out.println("I am exceptional!");
        }
    };

    class A {

    }


    static Special createDefaultImpl() {
        return special;
    }

    void doSomethingExceptional();
}
