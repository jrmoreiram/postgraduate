import java.util.*;

public class CountWordsDemo {

    public static void main(String[] args) {

        // See the text in a string
        String text = "Good morning students. Have a good class. Good studies! ";

        // Create a TreeMap to hold words as keys and count as values
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();

        String[] words = text.split(" "); // Sentence splitting based on String

        for (int i = 0; i < words.length; i++) {

            String key = words[i].toLowerCase();

            if (key.length() > 0) {

                if (map.get(key) == null) {

                    map.put(key, 1);

                } else {

                    int value = map.get(key).intValue();

                    value++;

                    map.put(key, value);

                }

            }

        }

        System.out.println(map);

    }

}