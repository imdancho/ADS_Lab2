import java.util.EmptyStackException;
import java.util.ArrayList;

public class MyArrayListStack {
    ArrayList<Object> stack = new ArrayList<Object>();

    public MyArrayListStack() {
    }

    public void push(Object o) {
        stack.add(o);
    }
    
    public void pop(Object o) {
        int size = stack.size();
        stack.remove(size);
    }

    public int sizee(Object o) {
        return stack.size();
    }




}
