public class StringCompareDemo {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Java";

        System.out.print("Comparing S1 and S2 ");
        System.out.println(s1.equals(s2));

        System.out.print("Comparing S1 and S3 ");
        System.out.println(s1.equals(s3));

        System.out.print("Comparing S3 and S4 ");
        System.out.println(s3.equals(s4));

        System.out.print("Comparing S1 and S4 ");
        System.out.println(s1.equals(s4));

    }
}