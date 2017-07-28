package package170728.exceptions;

public class CastRuntimeExceptionsExamples {
    public static void main(String[] args) {
        cast();
    }

    private static void cast() {
        Object o = "hello";

//        o = new StringBuilder();

        String s = castToString(o);
        System.out.println(s);

        castToStringWithInstanceOf(o);
    }

    private static String castToStringWithInstanceOf(Object o) {
        return o instanceof String ? (String) o : "";
    }

    private static String castToString(Object o) {
        String s;

        try {
            s = (String) o;
        } catch (Exception e) {
            s = "";
        }

        return s;
    }
}
