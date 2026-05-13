import java.util.LinkedList;

public class LinkedListLesson {
    public static void main(String args[]) {
       LinkedList<String> animais = new LinkedList<>();
       animais.add("Cachorro");
       animais.add("Cavalo");
       animais.add("Vaca");
       
       System.out.println("LinkedList: " + animais);
       
       animais.add(1, "Gato");
       
       System.out.println("LinkedList: " + animais);
    }
}