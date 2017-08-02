package day170802.generics.stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("one");
//        stack.push(1);

        Stack<Number> stackNumber = new Stack<>();

//        stackNumber.push("one");
        stackNumber.push(1);
    }
}
