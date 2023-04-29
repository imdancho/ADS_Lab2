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

    public static int sizee() {
        return stack.size();
    }




}
