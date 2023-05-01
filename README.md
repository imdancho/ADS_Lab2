# MyArrayListStack, MyLinkedListStack

## _push()_ function: 
It adds an element to the top of the stack.

Solution:

```java
public static void push(Object o) {
        stack.add(o);
    } 
```

## _pop()_ function: 
It removes and returns the top element of the stack.

Solution:

```java
    public static Object pop() {
        Object element = null;
        try {
            int size = stack.size();
            if ((size-1)>=0) {
                element = stack.remove(size-1);

            }

        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
        }
        return element;
    }
```

## _peek()_ function: 
It returns the top element of the stack without removing it.

Solution:

```java
    public static Object peek() {
        try {
            int size = stack.size();
            if ((size-1)>=0) {
                return stack.get(size-1);
            }
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
        }

        return null;
    }
```

## _isEmpty()_ function: 
It returns true if the stack is empty or false if it is not.

Solution:

```java
    public static Boolean isEmpty() {
        return stack.isEmpty();
    }
```

## _size()_ function: 
It returns the number of elements in the stack.

Solution:

```java
    public static int size() {
        return stack.size();
    }
```


# MyArrayListQueue, MyLinkedListQueue

## _enqueue()_ function: 
It adds an element to the back of the queue.

Solution:

```java
    public static void enqueue(Object o) {
        queue.addLast(o);
    }
```

## _dequeue()_ function: 
It removes and returns the front element of the queue.

Solution:

```java
    public static Object dequeue () {
        Object element = null;
        try {
            int size = queue.size();
            if ((size)>0) {
                element = queue.get(0);
                queue.removeFirst();
            }

        } catch (EmptyStackException e) {
            System.out.println("Queue is empty!");
        }
        return element;
    }
```

## _peek()_ function: 
It returns the front element of the queue without removing it.

Solution:

```java
    public static Object peek() {
        Object element = null;
        try {
            int size = queue.size();
            if ((size)>0) {
                element = queue.getFirst();
            }

        } catch (EmptyStackException e) {
            System.out.println("Queue is empty!");
        }
        return element;
    }
```

## _isEmpty()_ function: 
It returns true if the queue is empty or false if it is not.

Solution:

```java
    public static Boolean isEmpty() {
        return queue.isEmpty();
    }
```

## _size()_ function: 
It returns the number of elements in the queue.

Solution:

```java
    public static int size() {
        return queue.size();
    }
```
