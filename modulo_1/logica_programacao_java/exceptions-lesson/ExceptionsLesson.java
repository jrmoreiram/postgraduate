import java.util.Scanner;

public class ExceptionsLesson {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       try{
           System.out.println("Digite um valor:");
           int number1 = sc.nextInt();
           
           System.out.println(number1);
       } catch(Exception ex) {
           System.out.println("ERRO -  Valor digitado nao e um numero.");
       }
    }
}