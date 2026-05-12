import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Creating a Map of fruits and their prices
        Map<String, Integer> tMap = new TreeMap<String, Integer>();

        tMap.put("Orange", 12);
        tMap.put("Apple", 25);
        tMap.put("Mango", 45);
        tMap.put("Persimmon", 10);
        tMap.put("Banana", 4);
        tMap.put("Strawberry", 90);

        System.out.println("Sort fruits by name: " + tMap);

        tMap.put("Grape", 87);

        tMap.remove("Persimmon");

        System.out.println("Updated set of fruits sorted by name: " + tMap);

    }

}