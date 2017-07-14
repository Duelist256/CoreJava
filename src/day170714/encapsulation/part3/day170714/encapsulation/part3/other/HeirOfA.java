package day170714.encapsulation.part3.day170714.encapsulation.part3.other;

import day170714.encapsulation.part3.A;

/**
 * Created by Duelist on 14.07.2017.
 */
public class HeirOfA extends A {
    public static void main(String[] args) {
        A a = new A();
//        a.m1();
//        a.m2();
//        a.m3();
        a.m4();

        HeirOfA heir = new HeirOfA();
//        heir.m1();
//        heir.m2();
        heir.m3();
        heir.m4();
    }
}
