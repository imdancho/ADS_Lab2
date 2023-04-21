import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[10];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public void add(T item) {
        if (this.size == this.elements.length) {
            Object[] newElements = new Object[this.elements.length * 2];
            System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
            this.elements = newElements;
        }
        this.elements[this.size] = item;
        this.size++;
    }

    public void add(T item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size);
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        size++;
    }


    public boolean remove(T item) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if ((item == null && elements[i] == null) || (item != null && item.equals(elements[i]))) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }


    public T remove(int index) {
        T removed = (T) this.elements[index];
        System.arraycopy(this.elements, index + 1, this.elements, index, this.size - index - 1);
        this.size--;
        return removed;
    }

    public void clear() {
        elements = new Object[0];
        size = 0;
    }

    public T get(int index) {
        return (T) this.elements[index];
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void sort() {
        Arrays.sort(elements, 0, size);
    }
}
