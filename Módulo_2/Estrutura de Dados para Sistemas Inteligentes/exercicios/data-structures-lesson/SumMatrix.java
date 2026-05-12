import javax.swing.*;

class SumMatrix {

    public static void main(String args[]) {

        // declaring the SumMax matrix of size 10x12 of integer type
        // also declared variables a, b and sum, sum already starting at 0

        int SumMax[][], a, b, sum = 0;

        // building the matrix in Java

        SumMax = new int[10][12];

        // using loop structures to go through the 120 positions of the matrix.
        // positions range from 0 to 9 in rows and 0 to 11 in columns
        // inside the loop structures, shows a message to the user
        // and assigns the value to the matrix
        // accumulates the sum of the matrix values in the variable sum

        for (a = 0; a <= 9; a++) {

            for (b = 0; b <= 11; b++) {

                SumMax[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer value"));

                sum = sum + SumMax[a][b];

            } // for

        } // for

        // displaying the sum value to the user
        System.out.println("The sum of the 120 entered values is: " + sum);

        System.exit(0);

    } // void main

} // class SumMatrix