import java.util.EmptyStackException;
import java.util.LinkedList; //importing the necessary classes

public class MyLinkedListQueue {
    static LinkedList<Object> queue = new LinkedList<Object>();

    public MyLinkedListQueue() { //a constructor for the class
    }

    public static void enqueue(Object o) {
        queue.addLast(o);
    }

    public static Object dequeue () {
        Object element = null;
        try {
            int size = queue.size(); //check size
            if ((size)>0) { //if its not empty
                element = queue.get(0); //store
                queue.removeFirst(); //remove element
            }

        } catch (EmptyStackException e) { //exception
            System.out.println("Queue is empty!"); //message
        }
        return element;
    }

    public static Object peek() { //It returns the top element of the queue without removing it.
        Object element = null;
        try {
            int size = queue.size(); //check size
            if ((size)>0) { //if its not empty
                element = queue.getFirst(); //store
            }

        } catch (EmptyStackException e) { //exception
            System.out.println("Queue is empty!"); //message
        }
        return element; //return that element
    }

    public static Boolean isEmpty() { //It returns true if the queue is empty or false if it is not.
        return queue.isEmpty(); //check if its empty and returns it
    }

    public static int size() { //It returns the number of elements in the queue.
        return queue.size(); //returns size
    }
}
