package day170724.serializable;

import java.io.*;
import java.util.Arrays;

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A();
        a.x = 10;
        a.s = "Hello";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(a);

        byte[] data = baos.toByteArray();
        System.out.println(Arrays.toString(data));

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bais);
        A a2 = (A) ois.readObject();
        System.out.println(a2.x + " " + a2.s);
    }
}

class A implements Serializable {
    int x;
    String s;
}
