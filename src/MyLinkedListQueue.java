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
}
