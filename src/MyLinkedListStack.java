import java.util.EmptyStackException;
import java.util.LinkedList ;

public class MyLinkedListStack {
    static LinkedList<Object> stack = new LinkedList<Object>();

    public MyLinkedListStack() {
    }

    public static void push(Object o) {
        stack.addFirst(o);
    }

    public static Object pop() {
        Object element = null;
        try {
            int size = stack.size();
            if ((size)>0) {
                element = stack.get(0);
                stack.removeFirst();
            }

        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
        }
        return element;
    }

    public static Object peek() {
        Object element = null;
        try {
            int size = stack.size();
            if ((size)>0) {
                element = stack.get(0);
            }

        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
        }
        return element;
    }

    public static Boolean isEmpty() {
        int size = stack.size();
        if (size==0) return true;
        else return false;
    }
}
