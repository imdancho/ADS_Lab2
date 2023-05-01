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
        Object element = null;
        try {
            int size = queue.size();
            if ((size)>0) {
                element = queue.get(0);
                queue.remove(0);
            }

        } catch (EmptyStackException e) {
            System.out.println("Queue is empty!");
        }
        return element;
    }

    public static Object peek() {
        Object element = null;
        try {
            int size = queue.size();
            if ((size)>0) {
                element = queue.get(0);
            }

        } catch (EmptyStackException e) {
            System.out.println("Queue is empty!");
        }
        return element;
    }

    public static Boolean isEmpty() {
        return queue.isEmpty();

    }

    public static int size() {
        return queue.size();
    }
}
