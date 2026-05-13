import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // declaring an ArrayList of String objects
        ArrayList<String> myList = new ArrayList<String>();

        // Adding objects to the ArrayList at the default index
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        myList.add("Grapes");

        // Adding object at a specific index
        myList.add(1, "Orange");
        myList.add(2, "Pineapple");

        System.out.println("Display all objects:");

        for (String s : myList) {
            System.out.println(s);
        }

        System.out.println("Object at index 3: " + myList.get(3));

        System.out.println("Is Persimmon in the list: " + myList.contains("Chicku"));

        System.out.println("ArrayList size: " + myList.size());

        myList.remove("Papaya");

        System.out.println("New ArrayList size: " + myList.size());
    }

}