public class ReturnDemo {

    public static void main(String[] args) {

        for (int k = 25; k < 31; k++) {

            new ReturnDemo().checkEven(k);

        }

    }

    public boolean checkEven(int a) {

        if (a % 2 == 0) {

            System.out.println(a + " It is even");

            return true;

        }

        System.out.println(a + " It is odd");
        return false;

    }
}