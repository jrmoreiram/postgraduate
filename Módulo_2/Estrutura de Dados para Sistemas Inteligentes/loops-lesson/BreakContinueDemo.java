public class BreakContinueDemo {

    public static void main(String[] args) {

        int[] numbers = {
            10, 23, 19, 34, 54, 23, 76, 39, 65, 24, 8, 0, 12, 55
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] <= 0) {

                System.out.println("Break because number = " + numbers[i]);
                break;

            } else if (numbers[i] % 2 != 0) {

                System.out.println("Odd number found in array, ignoring number " + numbers[i]);
                continue;

            } else {
                sum = sum + numbers[i];
            }

        }

        System.out.println("Sum of all numbers = " + sum);

    }
}