import java.util.EmptyStackException;
import java.util.ArrayList;

public class MyArrayListStack {
    static ArrayList<Object> stack = new ArrayList<Object>();

    public MyArrayListStack() {
    }

    public static void push(Object o) {
        stack.add(o);
    }

    public static void pop() {
        int size = stack.size();
        stack.remove(size-1);
    }

    public static Object peek() {
        int size = stack.size();
        return stack.get(size-1);
    }

    public static Boolean isEmpty() {
        int size = stack.size();
        if (size==0) return true;
        else return false;
    }

    public static int sizee() {
        return stack.size();
    }




}
