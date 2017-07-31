package day170728.exceptions.stack;

import static day170728.exceptions.stack.StringStackWithThrow.Overflow;

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
        } catch (Overflow e) {
            System.err.println("Stack overflow occured with size " + e.getSize());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
