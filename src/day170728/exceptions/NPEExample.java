package day170728.exceptions;

public class NPEExample {
    public static void main(String[] args) {

        printObjectInfo("hello");

        try {
            printObjectInfo(null);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }

        printObjectInfo(new Object());
    }

    private static void printObjectInfo(Object o) {

        if (o == null) { // Guard condition
            return;
        }

        System.out.println("Class name " + o.getClass().getCanonicalName());
        System.out.println("Class hash " + o.hashCode());
        System.out.println("Class string " + o.toString());
    }
}
