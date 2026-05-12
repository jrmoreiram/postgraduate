import javax.swing.*;

class BubbleSort {

    public static void bubble(int numbers[]) {

        final int n = numbers.length;

        int aux;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;

                }

            }

        }

    }

    public static void main(String arg[]) {

        int num[] = new int[10];

        for (int i = 0; i < 10; i++) {

            String s;

            s = JOptionPane.showInputDialog("Enter an integer number");

            num[i] = Integer.parseInt(s);

        }

        bubble(num);

        String s = "";

        for (int i = 0; i < num.length; i++) {

            s = s + num[i] + " ";

        }

        JOptionPane.showMessageDialog(null, s);

        System.exit(0);

    }

}