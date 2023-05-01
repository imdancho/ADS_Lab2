import java.util.EmptyStackException;
import java.util.LinkedList ;

public class MyLinkedListQueue {
    static LinkedList<Object> queue = new LinkedList<Object>();

    public MyLinkedListQueue() {
    }

    public static void enqueue(Object o) {
        queue.addLast(o);
    }

    public static Object dequeue () {
        Object element = null;
        try {
            int size = queue.size();
            if ((size)>0) {
                element = queue.get(0);
                queue.removeFirst();
            }

        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
        }
        return element;
    }

    public static Object peek() {
        Object element = null;
        try {
            int size = queue.size();
            if ((size)>0) {
                element = queue.getFirst();
            }

        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
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
