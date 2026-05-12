import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CustomTreeSetDemo {
	
	public static void main(String[] args) {

        TreeSet<Cricketer> playerSet = new TreeSet<Cricketer>(
            new CompareCricketer()
        );

        playerSet.add(new Cricketer("Sonia", 1));
        playerSet.add(new Cricketer("Zelia", 9));
        playerSet.add(new Cricketer("Marcos", 7));
        playerSet.add(new Cricketer("Belem", 8));
        playerSet.add(new Cricketer("Veronica", 2));
        playerSet.add(new Cricketer("Juliana", 4));
        playerSet.add(new Cricketer("Ismael", 10));
        playerSet.add(new Cricketer("Uriel", 11));
        playerSet.add(new Cricketer("Pedro", 5));
        playerSet.add(new Cricketer("Vanessa", 3));
        playerSet.add(new Cricketer("Raina", 6));

        Iterator<Cricketer> it = playerSet.iterator();

        while (it.hasNext()) {

            System.out.println(it.next().getName());

        }

    }

    public static class Cricketer {

        private String name;
        private int battingPosition;

        Cricketer(String cricketerName, int battingPosition) {

            this.name = cricketerName;
            this.battingPosition = battingPosition;

        }

        public String getName() {

            return name;

        }

        public int getBattingPosition() {

            return battingPosition;

        }

    }

    public static class CompareCricketer implements Comparator<Cricketer> {

        @Override
        public int compare(Cricketer c1, Cricketer c2) {

            if (c1.getBattingPosition() > c2.getBattingPosition())
                return 1;

            else if (c1.getBattingPosition() < c2.getBattingPosition())
                return -1;

            else 
                return 0;
        }
    }
}