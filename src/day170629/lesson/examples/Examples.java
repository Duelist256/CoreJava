package day170629.lesson.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Duelist on 29.06.2017.
 */
public class Examples {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<A> c = A.class;

        Method method = c.getMethod("m");
        A a = new A();
        method.invoke(a, null);

        Constructor<A> constructor = c.getConstructor();
        A a2 = constructor.newInstance(null);

        A a3 = c.newInstance();
    }
}
