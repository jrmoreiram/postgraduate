public class LabeledBreakContinueDemo {

    public static void main(String[] args) {

        int breakLimit = 9;

        outer: for (int i = 0;; i++) {

            for (int j = 0; j < 10; j++) {

                if (j > i) {

                    System.out.println();
                    continue outer;

                }

                System.out.print(" " + (i * j));

            }

            if (i == breakLimit) {

                break outer;

            }

        }

        System.out.println();

    }

}