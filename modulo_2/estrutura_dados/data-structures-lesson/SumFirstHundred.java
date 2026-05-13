import javax.swing.*;

class SumFirstHundred {

    public static void main(String arg[]) {

        int sum;

        sum = sumRecursive(1, 0);

        JOptionPane.showMessageDialog(null, "The sum of the first one hundred numbers is: " + sum);

        System.exit(0);
    }

    public static int sumRecursive(int number, int sum) {

        int result;

        if (number == 100) {

            result = number + sum;

        } else {

            result = sumRecursive(number + 1, number + sum);

        }

        return result;
    }
}