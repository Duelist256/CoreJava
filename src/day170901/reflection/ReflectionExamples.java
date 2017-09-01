package day170901.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExamples {
    static {
        System.out.println("static init");
    }

    public static void main(String[] args) {

        new Sample();

        Class<Sample> clazz = Sample.class; // объект, описывающий класс (содержит всю
        // информацию о нём)

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println();

        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        try {
            Sample sample = clazz.newInstance();
            Method method = clazz.getMethod("bigChange", null);
            method.invoke(sample, null);
        } catch (InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class Sample {
    public static final int MAX = 10;

    static {
        System.out.println("trololo");
    }

    void change() {

    }

    public void bigChange() {
        System.out.println("very big change!");
    }
}