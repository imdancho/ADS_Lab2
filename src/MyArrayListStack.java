import java.util.EmptyStackException;
import java.util.ArrayList;

public class MyArrayListStack {
    static ArrayList<Object> stack = new ArrayList<Object>();

    public MyArrayListStack() {
    }

    public static void push(Object o) {
        stack.add(o);
    }

    public static Object pop() {
        Object element = null;
        try {
            int size = stack.size();
            if ((size-1)>=0) {
                element = stack.remove(size-1);
            }

        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
        }
        return element;
    }

    public static Object peek() {
        try {
            int size = stack.size();
            if ((size-1)>=0) {
                return stack.get(size-1);
            }
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
        }

        return null;
    }

    public static Boolean isEmpty() {
        int size = stack.size();
        if (size==0) return true;
        else return false;
    }

    public static int size() {
        return stack.size();
    }

}
