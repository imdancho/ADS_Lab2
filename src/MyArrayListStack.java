import java.util.EmptyStackException;
import java.util.ArrayList; //importing the necessary classes

public class MyArrayListStack {
    static ArrayList<Object> stack = new ArrayList<Object>();

    public MyArrayListStack() { //a constructor for the class
    }

    public static void push(Object o) { //It adds an element to the top of the stack.
        stack.add(o);
    }

    public static Object pop() { //It removes and returns the top element of the stack.
        Object element = null;
        try {
            int size = stack.size(); //check size
            if ((size-1)>=0) { //if its not empty
                element = stack.remove(size-1); //store
                stack.remove(0); //remove element
            }

        } catch (EmptyStackException e) { //exception
            System.out.println("Stack is empty!");
        }
        return element;
    }

    public static Object peek() { //It returns the top element of the stack without removing it.

        try {
            int size = stack.size(); //check size
            if ((size-1)>=0) { //if its not empty
                return stack.get(size-1); //return element
            }
        } catch (EmptyStackException e) { //exception
            System.out.println("Stack is empty!"); //message
        }
        return null;
    }

    public static Boolean isEmpty() { //It returns true if the stack is empty or false if it is not.
        return stack.isEmpty(); //check if its empty and returns it
    }

    public static int size() { //It returns the number of elements in the stack.
        return stack.size(); //returns size
    }

}
