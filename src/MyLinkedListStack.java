import java.util.EmptyStackException;
import java.util.LinkedList; //importing the necessary classes

public class MyLinkedListStack {
    static LinkedList<Object> stack = new LinkedList<Object>();

    public MyLinkedListStack() { //a constructor for the class
    }

    public static void push(Object o) { //It adds an element to the top of the stack.
        stack.addFirst(o);
    }

    public static Object pop() { //It removes and returns the top element of the stack.
        Object element = null; //temp store for the element
        try {
            int size = stack.size(); //size of the stack
            if ((size)>0) { //if its not empty
                element = stack.get(0); //store
                stack.removeFirst(); //remove element
            }

        } catch (EmptyStackException e) { //exception
            System.out.println("Stack is empty!"); //message
        }
        return element; //return
    }

    public static Object peek() { //It returns the top element of the stack without removing it.
        Object element = null;
        try {
            int size = stack.size(); //check size
            if ((size)>0) { //if its not empty
                element = stack.getFirst();
            }
        } catch (EmptyStackException e) { //exception
            System.out.println("Stack is empty!"); //message
        }
        return element; //return element
    }

    public static Boolean isEmpty() { //It returns true if the stack is empty or false if it is not.
        return stack.isEmpty(); //check if its empty and returns it
    }

    public static int size() { //It returns the number of elements in the stack.
        return stack.size(); //returns size
    }
}
