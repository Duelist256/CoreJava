package day170712.lesson.stack;

/**
 * Created by Duelist on 12.07.2017.
 */
public class UseStack {

    public static void main(String[] args) {
        StringStack stack = new StringStack();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println(stack);


        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.tos());

        System.out.println(stack);
        System.out.println(stack.tos());
    }
}
