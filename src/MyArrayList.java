import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size = 0;
    private int capacity = 0;
    private int[] array;


    public MyArrayList() {
        array = new int[capacity];
    }

    public int gett(int index) {
        return array[index];
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


    public void add(T Newitem) {
        if (size == capacity) {
            increaseBuffer(1);
        }
        array[size++] = (int) Newitem;
    }


    public void addList(int[] array3) { ////////////////////////////////////////////////////////add all
        int sizee = array3.length;
        System.out.println(sizee);
        increaseBuffer(sizee);

        for (int i = 0; i<sizee; i++) {
            array[size+i-1] = array3[i];
        }


    }

    public void increaseBuffer(int numb) {
        capacity  = capacity + numb;
        int[] array2 = new int[capacity];
        for (int i = 0; i<size; i++) {
            array2[i] = array[i];
        }
        array = array2;
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

    public int get(int index) {
        return array[index];
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
