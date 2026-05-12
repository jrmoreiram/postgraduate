import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> playerSet = new TreeSet<String>();

        playerSet.add("Sonia");
        playerSet.add("Zelia");
        playerSet.add("Marcos");
        playerSet.add("Belem");
        playerSet.add("Veronica");
        playerSet.add("Juliana");
        playerSet.add("Ismael");
        playerSet.add("Uriel");
        playerSet.add("Pedro");
        playerSet.add("Vanessa");
        playerSet.add("Sonia");  

        // below it will print the set in alphabetical order
        System.out.println("Original Set: " + playerSet);

        System.out.println("First Name: " + playerSet.first());

        System.out.println("Last Name: " + playerSet.last());

        TreeSet<String> newPlySet = (TreeSet<String>) playerSet.subSet("Marcos", "Vanessa");

        System.out.println("Sub set: " + newPlySet);

    }

}