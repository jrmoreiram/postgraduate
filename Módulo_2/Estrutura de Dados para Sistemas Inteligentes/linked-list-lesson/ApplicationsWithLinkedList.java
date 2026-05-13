import javax.swing.*;

class Node {

    double element;
    Node next;

    Node(double elem) {
        element = elem;
        next = null;
    }

}

class LinkedList {

    Node first, last;

    LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {

        if (first == null && last == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insertAtBeginning(Node newNode) {

        if (isEmpty()) {
            last = newNode;
        } else {
            newNode.next = first;
        }

        first = newNode;

    }

    public void insertAtEnd(Node newNode) {

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;

    }

    public int countNodes() {

        int size = 0;
        Node tempNode = first;

        while (tempNode != null) {
            size = size + 1;
            tempNode = tempNode.next;
        }

        return size;

    }

    public void insertAtMiddle(Node newNode, int position) {

        Node tempNode = first;
        int nodeCount, auxPos = 1;

        nodeCount = countNodes();

        if (position <= 1) {
            insertAtBeginning(newNode);
        } else {
            if (position > nodeCount) {
                insertAtEnd(newNode);
            } else {
                while (auxPos < (position - 1)) {
                    tempNode = tempNode.next;
                    auxPos = auxPos + 1;
                }
                newNode.next = tempNode.next;
                tempNode.next = newNode;
            }
        }

    }

    public void remove(double element) {

        Node tempNode = first;
        Node prevNode = null;

        if (first.element == element) {
            first = first.next;
        } else {
            while (tempNode != null && tempNode.element != element) {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }
            if (tempNode != null) {
                prevNode.next = tempNode.next;
            }
            if (tempNode == last) {
                last = prevNode;
            }
        }

    }

    public void showFirstElement() {

        if (!isEmpty()) {
            System.out.println("The first element is " + first.element);
        } else {
            System.out.println("Empty Linked List");
        }

    }

    public void showLastElement() {

        if (!isEmpty()) {
            System.out.println("The last element is " + last.element);
        } else {
            System.out.println("Empty Linked List");
        }

    }

    public Node searchNode(double element) {

        int i = 1;
        Node tempNode = first;

        while (tempNode != null) {
            if (tempNode.element == element) {
                System.out.println("Node " + tempNode.element + " position " + i);
                return tempNode;
            }
            i = i + 1;
            tempNode = tempNode.next;
        }

        return null;

    }

    public void displayList() {

        int i = 1;
        Node tempNode = first;

        while (tempNode != null) {
            System.out.println("Element " + tempNode.element + " position " + i);
            tempNode = tempNode.next;
            i = i + 1;
        }

    }

}

class ApplicationsWithLinkedList {

    public static void main(String arg[]) {

        LinkedList realList = new LinkedList();

        int i;
        double num;

        for (i = 1; i <= 5; i++) {
            num = Double.parseDouble(JOptionPane.showInputDialog("Enter a real number"));
            realList.insertAtEnd(new Node(num));
        }

        realList.displayList();

        System.exit(0);

    }
}