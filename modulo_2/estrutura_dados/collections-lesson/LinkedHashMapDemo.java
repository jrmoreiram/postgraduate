import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String args[]) {

        // Here the insertion order is maintained
        Map<Integer, String> lmap = new LinkedHashMap<Integer, String>();

        lmap.put(12, "Maria");
        lmap.put(5, "Nicole");
        lmap.put(23, "Samuel");
        lmap.put(9, "Sonia");

        System.out.println("LinkedHashMap before modification " + lmap);

        System.out.println("Employee ID 12 exists: " + lmap.containsKey(12));

        System.out.println("Employee Andre exists: " + lmap.containsValue("Andre"));

        System.out.println("Total number of employees: " + lmap.size());

        System.out.println("Removing employee with ID 5: " + lmap.remove(5));

        System.out.println("Removing employee with ID 3 (which does not exist): " + lmap.remove(3));

        System.out.println("LinkedHashMap after modification " + lmap);

    }

}