import java.util.Scanner;

public class WhileLoopNegativeConditional {

  public static void main(String[] args) {

    int counter;

    Scanner inputDevice = new Scanner(System. in);

    System.out.print("Enter the loop counter value: ");

    counter = inputDevice.nextInt();

    if (counter > 5) {

      System.out.println("Counter is greater than 5. Counter = " + counter);

    } else {

      System.out.println("===== Before the While Loop =====");

      while (counter < 5) {

        System.out.println("Inside the Loop - Counter = " + counter);
        counter++;

      }

      System.out.println("===== After the While Loop  =====");
    }
  }
}