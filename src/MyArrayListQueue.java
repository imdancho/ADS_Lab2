import java.util.EmptyStackException;
import java.util.ArrayList;

public class MyArrayListQueue {
    static ArrayList<Object> queue = new ArrayList<Object>();

    public MyArrayListQueue() {
    }

    public static void enqueue(Object o) {
        queue.add(o);
    }

    public static Object dequeue() {
        Object element = queue.get(0);
        queue.remove(0);
        return element;
    }

    public static Object peek() {
        Object element = queue.get(0);
        return element;
    }

    public static Boolean isEmpty() {
        int size = queue.size();
        if (size==0) return true;
        else return false;
    }

    public static int sizee() {
        return queue.size();
    }
}
