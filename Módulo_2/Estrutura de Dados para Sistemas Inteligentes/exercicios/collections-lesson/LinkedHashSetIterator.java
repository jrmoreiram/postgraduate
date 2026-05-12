import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIterator {

    public static void main(String[] args) {

        Set<String> myCricketerSet = new LinkedHashSet<String>();

        myCricketerSet.add("Ariel");
        myCricketerSet.add("Daniela");
        myCricketerSet.add("Jussara");
        myCricketerSet.add("Benjamin");
        myCricketerSet.add("Flavio");
        myCricketerSet.add("Marcio");
        myCricketerSet.add("Valeria");
        myCricketerSet.add("Ramon");

        Iterator<String> setIterator = myCricketerSet.iterator();

        while (setIterator.hasNext()) {

            System.out.println(setIterator.next());

        }
    }
}