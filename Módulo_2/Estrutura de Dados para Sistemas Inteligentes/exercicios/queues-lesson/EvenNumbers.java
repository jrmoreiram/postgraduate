import javax.swing.*;

class EvenNumbers {

    public static void main(String arg[]) {

        Queue intQueue = new Queue(10);

        int i, input = 0;

        for (i = 1; i <= 10; i++) {

            input = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value"));

            if (input % 2 == 0) {

                intQueue.enqueue(input);

            }

        }

        intQueue.displayQueue();

        System.exit(0);

    }

}

class Queue {

    int size, start, end, total;

    int array[];

    Queue(int sz) {

        start = 0;

        end = 0;

        total = 0;

        size = sz;

        array = new int[sz];

    }

    public boolean isEmpty() {

        if (total == 0) {

            return true;

        } else {

            return false;

        }

    }

    public boolean isFull() {

        if (total >= size) {

            return true;

        } else {

            return false;

        }

    }

    public void enqueue(int element) {

        if (!isFull()) {

            array[end] = element;

            end = end + 1;

            total = total + 1;

            if (end >= size) {

                end = 0;

            }

        } else {

            System.out.println("Full Queue");

        }

    }

    public int dequeue() {

        int dequeued = 0;

        if (isEmpty()) {

            System.out.println("Empty Queue");

        } else {

            dequeued = array[start];

            start = start + 1;

            total = total - 1;

            if (start >= size) {

                start = 0;

            }

        }

        return dequeued;

    }

    public void showFirstElement() {

        if (!isEmpty()) {

            System.out.println("The first element is " + array[start]);

        } else {

            System.out.println("Empty Queue");

        }

    }

    public void displayQueue() {

        int i, aux;

        aux = start;

        for (i = 1; i <= total; i++) {

            JOptionPane.showMessageDialog(null, "Element " + array[aux] +
                " position " + i);

            aux = aux + 1;

            if (aux >= size) {

                aux = 0;

            }

        }

    }

}