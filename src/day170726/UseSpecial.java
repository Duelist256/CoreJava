package day170726;

public class UseSpecial {
    public static void main(String[] args) {

        Special special = Special.createDefaultImpl();

        special.doSomethingExceptional();

        Special special2 = Special.createDefaultImpl();

        System.out.println(special);
        System.out.println(special2);

        Special.A a = new Special.A();
    }
}