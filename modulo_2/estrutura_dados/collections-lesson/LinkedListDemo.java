import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<String>();

        myLinkedList.addFirst("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        myLinkedList.add("D");

        myLinkedList.add(2, "X");

        myLinkedList.addLast("Z");

        System.out.println("List before removing elements");
        System.out.println(myLinkedList);

        myLinkedList.remove();
        myLinkedList.removeLast();
        myLinkedList.remove("C");

        System.out.println("List after removing the first and last objects");
        System.out.println(myLinkedList);

        System.out.println("First object: " + myLinkedList.getFirst());
        System.out.println("Last object: " + myLinkedList.peekLast());
    }

}