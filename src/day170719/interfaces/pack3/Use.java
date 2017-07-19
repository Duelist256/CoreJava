package day170719.interfaces.pack3;

/**
 * Created by Duelist on 19.07.2017.
 */
public class Use {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        X x;
        Y y;
        Z z;

        z = c;
        y = b; y = c;
        x = a; x = b; x = c;
    }
}
