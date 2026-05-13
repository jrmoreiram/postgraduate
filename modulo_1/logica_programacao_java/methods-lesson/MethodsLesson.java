import java.util.Scanner;

public class MethodsLesson {

    static class Cao {
        private int idade;

				// Método SET — define o valor da idade
        public void setIdade(int idade) {
            this.idade = idade;
        }

				// Método GET — retorna o valor da idade
        public int getIdade() {
            return idade;
        }

				// Método que verifica se o cão é idoso (acima de 10 anos)
        public boolean VerificarIdade() {
            return idade > 10;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do cachorro: ");
        int idade = scanner.nextInt();

        Cao cachorro = new Cao();
        cachorro.setIdade(idade);

        if (cachorro.VerificarIdade()) {
            System.out.println("E idoso");
        } else {
            System.out.println("E novinho");
        }

        scanner.close();
    }
}