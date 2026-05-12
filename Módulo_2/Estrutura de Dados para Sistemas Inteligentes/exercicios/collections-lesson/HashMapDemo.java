import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        // The line below creates a HashMap with initial size 10 and load factor 0.5
        Map<String, Integer> funcSal = new HashMap<String, Integer>(10, 0.5f);

        // Adding employee name and salary to the map
        funcSal.put("Rita", 10000);
        funcSal.put("Samuel", 20000);
        funcSal.put("Maria", 30000);
        funcSal.put("Nicole", 1000);
        funcSal.put("Noemi", 15000);
        funcSal.put("Raquel", 10000); // Duplicate values are allowed, but keys must not repeat
        funcSal.put("Nicolas", null); // Values may also be null

        System.out.println("Original Map: " + funcSal); // Displaying complete map

        // Adding new employee to the map to verify order changes
        funcSal.put("Renato", 23000);

        // Removing one key-value pair
        funcSal.remove("Nicolas");

        System.out.println("Updated Map: " + funcSal); // Displaying complete map

        // Print all keys
        System.out.println(funcSal.keySet());

        // Print all values
        System.out.println(funcSal.values());

    }

}