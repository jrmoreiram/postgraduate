import javax.swing.*;

class FactorialP {

    static void factP(int n, int x, int f) {

        if (x == 0 || x == 1) {

            System.out.println("The factorial of " + n + " is " + f); // rule 1

        } else {

            // recursive function call
            factP(n, x - 1, f * x); // rules 2 and 3

        }

    }

    public static void main(String arg[]) {

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a value to calculate its factorial"));

        if (number < 0) {

            System.out.println("Invalid value for factorial calculation, the value must be greater than or equal to zero");

            System.exit(0);

        } else {

            factP(number, number, 1); // recursive function call

        }

        System.exit(0);

    }

}