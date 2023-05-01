import java.util.LinkedList ;

public class MyLinkedListStack {
    static LinkedList<Object> stack = new LinkedList<Object>();

    public MyLinkedListStack() {
    }

    public static void push(Object o) {
        stack.addFirst(o);
    }

}
