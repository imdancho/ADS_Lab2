import java.util.EmptyStackException;
import java.util.LinkedList ;

public class MyLinkedListQueue {
    static LinkedList<Object> queue = new LinkedList<Object>();

    public MyLinkedListQueue() {
    }

    public static void push(Object o) {
        queue.addLast(o);
    }
}
