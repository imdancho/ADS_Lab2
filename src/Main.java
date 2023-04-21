public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myAList = new MyArrayList<String>();
        myAList.add("first");
        myAList.add("second");
        System.out.println("Size of list: " + myAList.size());
        System.out.println("Element at index 1: " + myAList.get(1));
        myAList.remove(0);
        System.out.println("Size of list: " + myAList.size());


        MyList<String> myLList = new MyLinkedList<>();
        myLList.add("first");
        myLList.add("second");
        System.out.println("The size of the list is: " + myLList.size());
        System.out.println("Element at index 1: " + myLList.get(1));

        boolean removed = myLList.remove("first");
        System.out.println("Was 'first' removed from the list? " + removed);

        for (int i = 0; i < myLList.size(); i++) {
            String numm = myLList.get(i);
            System.out.println("element " + i + " is: " + numm);
        }
    }
}