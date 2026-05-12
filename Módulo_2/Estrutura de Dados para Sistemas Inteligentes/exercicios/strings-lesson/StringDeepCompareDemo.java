public class StringDeepCompareDemo {

    public static void main(String[] args) {

        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = "java";
        String s4 = "java";

        System.out.print("Comparing S1 and S2 ");
        System.out.println(s1 == s2);

        System.out.print("Comparing S1 and S3 ");
        System.out.println(s1 == s3);

        System.out.print("Comparing S3 and S4 ");
        System.out.println(s3 == s4);

        System.out.print("Comparing S1 and S4 ");
        System.out.println(s1 == s4);

    }
}