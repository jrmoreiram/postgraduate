import javax.swing.*;

class ApplyingStacksInJava {

    int size;
    int top;
    int array[];

    ApplyingStacksInJava(int sz) {

        top = -1;
        size = sz;
        array = new int[sz];

    }

    public boolean isEmpty() {

        if (top == -1) {

            return true;

        } else {

            return false;

        }

    }

    public boolean isFull() {

        if (top >= size - 1) {

            return true;

        } else {

            return false;

        }

    }

    public void push(int element) {

        if (!isFull()) {

            top = top + 1;

            array[top] = element;

        } else {

            System.out.println("Full Stack");

        }

    }

    public int pop() {

        int popped = 0;

        if (isEmpty()) {

            System.out.println("Empty Stack");

        } else {

            popped = array[top];

            top = top - 1;

        }

        return popped;

    }

    public void showTopElement() {

        if (top >= 0) {

            System.out.println("The top element is " + array[top]);

        } else {

            System.out.println("Empty Stack");

        }

    }

    public void displayStack() {

        int i;

        for (i = top; i >= 0; i--) {

            System.out.println("Element " + array[i] + " position " + i +
                " of the Stack");

        }

    }

    public static void main(String arg[]) {

        ApplyingStacksInJava intStack = new ApplyingStacksInJava(5);
        int i;
        int input;

        for (i = 1; i <= 5; i++) {

            input = Integer.parseInt(JOptionPane.showInputDialog(
                "Enter an integer value"));

            intStack.push(input);

        }

        intStack.displayStack();

        System.exit(0);

    }

}