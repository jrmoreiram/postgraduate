import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        linkedset.add("Masserati");
        linkedset.add("BMW");
        linkedset.add("Honda");
        linkedset.add("Audi");
        linkedset.add("Masserati");
        linkedset.add("Volkswagen");

        System.out.println("Size of LinkedHashSet = " + linkedset.size());

        System.out.println("Original LinkedHashSet: " + linkedset);

        System.out.println("Removing Audi from LinkedHashSet: " + linkedset.remove("Audi"));

        System.out.println("Attempting to remove Z, which is not present: " + linkedset.remove("Z"));

        System.out.println("Checking if Masserati is present = " + linkedset.contains("Masserati"));

        System.out.println("Updated LinkedHashSet: " + linkedset);

    }

}