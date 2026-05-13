import javax.swing.*;

class Queue {

    int size, start, end, total;

    double array[];

    Queue(int sz) {

        start = 0;

        end = 0;

        total = 0;

        size = sz;

        array = new double[sz];

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

    public void enqueue(double element) {

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

    // returns the dequeued value
    public double dequeue() {

        double dequeued = 0.0;

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

            JOptionPane.showMessageDialog(null, "Element " + array[aux] + " position " + i);

            aux = aux + 1;

            if (aux >= size) {

                aux = 0;

            }

        }

    }

}

class QueueingApplicationsInJava {

    public static void main(String arg[]) {

        Queue realQueue = new Queue(5);

        double input = 0.0;

        int i;

        for (i = 0; i < 5; i++) {

            input = Double.parseDouble(JOptionPane.showInputDialog("Enter a real value"));

            realQueue.enqueue(input);

        }

        realQueue.displayQueue();

        System.exit(0);

    }

}