import javax.swing.*;

class Factorial {

    static int fact(int n) {

        int f;

        if (n == 0) {

            return 1; // rule 1

        } else {

            // recursive function call
            f = n * fact(n - 1); // rules 2 and 3

            return f;

        }

    }

    public static void main(String arg[]) {

        int f, number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a value to calculate its factorial"));

        if (number < 0) {

            System.out.println("Invalid value for factorial calculation, the value must be greater than or equal to zero");

            System.exit(0);

        } else {

            f = fact(number); // recursive function call

            System.out.println("The factorial of " + number + " is " + f);

        }

        System.exit(0);

    } // end of void main

} // end of class