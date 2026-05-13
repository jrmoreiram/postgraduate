import javax.swing.*;

class Power {

    // This is the recursive function method called pow
    // that receives two integers and returns an integer
    static int pow(int base, int exp) {

        if (base == 0) { // recursive stop, case 1 of recursion

            return 0;

        } else {

            if (exp == 0) { // recursive stop, case 1 of recursion

                return 1;

            } else {

                return pow(base, exp - 1) * base; // recursive call, cases 2 and 3 of recursion

            }

        }

    } // end of function pow

    // writing the main method in Java
    public static void main(String input[]) {

        int b, e, p;

        b = Integer.parseInt(JOptionPane.showInputDialog("Enter the base for the power calculation"));

        e = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent for the power calculation"));

        if (b < 0 || e < 0) {

            System.out.println("Incorrect value entered, values must be greater than or equal to zero");

        } else {

            p = pow(b, e);

            System.out.println(b + " raised to " + e + " is equal to " + p);

        }

        System.exit(0);

    } // end of main

} // end of class