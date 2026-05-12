import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<String> student = new ArrayList();

        student.add("Naomi");
        student.add("Maria");
        student.add("Amanda");
        student.add("Paulo");
        student.add("Sofia");
        student.add("Naomi");
        student.add("Zelia");

        System.out.println("Original list " + student);

        Collections.sort(student);
        System.out.println("Alphabetically sorted list " + student);

        Collections.reverse(student);
        System.out.println("Reversed list " + student);

        Collections.shuffle(student);
        System.out.println("Randomized list " + student);

        System.out.println("Checking occurrences of Naomi: " + Collections.frequency(student, "Naomi"));
    }

}