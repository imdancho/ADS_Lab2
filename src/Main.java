public class Main {
    public static void main(String[] args) {

        System.out.println(MyArrayListStack.isEmpty());

        MyArrayListStack.push(1);
        MyArrayListStack.push(2);
        MyArrayListStack.push(3);
        MyArrayListStack.push(4);
        MyArrayListStack.push(6);
        System.out.println(MyArrayListStack.sizee());

        System.out.println(MyArrayListStack.peek());

        MyArrayListStack.pop();
        MyArrayListStack.pop();
        MyArrayListStack.pop();
        MyArrayListStack.pop();
        MyArrayListStack.pop();
        MyArrayListStack.pop();

        System.out.println(MyArrayListStack.sizee());
        System.out.println(MyArrayListStack.peek());
        System.out.println(MyArrayListStack.peek());
        System.out.println(MyArrayListStack.peek());
        System.out.println(MyArrayListStack.peek());

        System.out.println(MyArrayListStack.isEmpty());




//        MyArrayList<Integer> myAList = new MyArrayList<Integer>();
//        myAList.add(2);
//        myAList.add(3);
//        myAList.add(5);
//        myAList.add(9);
//        myAList.add(8);
//        System.out.println("Size of list: " + myAList.size());
//
//        System.out.println("Elements:");
//        for (int i = 0; i < myAList.size(); i++) {
//            System.out.print(myAList.get(i) + " ");
//
//        }
//        int[] array3 = {5, 9, 8, 8};
//        myAList.addList(array3);
//
//        System.out.println("Elements:");
//        for (int i = 0; i < myAList.size(); i++) {
//            System.out.print(myAList.get(i) + " ");
//        }
//
//        System.out.println("Size of list: " + myAList.size());


        //System.out.println("Size of list: " + myAList.size());


//        MyList<String> myLList = new MyLinkedList<>();
//        myLList.add("first");
//        myLList.add("second");
//        System.out.println("The size of the list is: " + myLList.size());
//        System.out.println("Element at index 1: " + myLList.get(1));
//
//        boolean removed = myLList.remove("first");
//        System.out.println("Was 'first' removed from the list? " + removed);
//
//        for (int i = 0; i < myLList.size(); i++) {
//            String numm = myLList.get(i);
//            System.out.println("element " + i + " is: " + numm);
//        }
    }
}