package package170728.exceptions.stack;

public class UseStack {
    public static void main(String[] args) {
        StringStackWithTryCatch stack = new StringStackWithTryCatch(2);

        stack.push("one");
        stack.push("two");
        System.out.println(stack.push("three"));

        StringStackWithThrow stackWithThrow = new StringStackWithThrow(2);
        try {
            stackWithThrow.push("one");
            stackWithThrow.push("two");
            stackWithThrow.push("three");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
