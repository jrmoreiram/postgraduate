public class EnhancedForLoopDemo {

    public static void main(String[] args) {

        int[] myArray = new int[10];

        int i = 0;

        // Traditional for loop to fill the array
        for (int k = 100; k > 0; k = k - 10, i++) {

            myArray[i] = k;

        }

        // Enhanced for loop to display array elements
        for (int loopVal : myArray) {

            System.out.println(loopVal);

        }

    }

}