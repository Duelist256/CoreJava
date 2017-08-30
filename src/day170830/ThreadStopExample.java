package day170830;

import day170828.Utils;

import static day170830.RaceConditionExample2.Modifier;

public class ThreadStopExample {
    public static void main(String[] args) {

        System.out.println("start");

        Model model = new Model();

        Modifier task = new Modifier(model);

        Thread t = new Thread(task);

        t.start();

        Utils.pause(500);

        t.stop();


        model.check();

        System.out.println("finish " + model);
    }
}
