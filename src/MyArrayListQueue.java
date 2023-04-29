import java.util.EmptyStackException;
import java.util.ArrayList;

public class MyArrayListQueue {
    static ArrayList<Object> stack = new ArrayList<Object>();

    public MyArrayListQueue() {
    }

    public static void enqueue(Object o) {
        stack.add(o);
    }
}
