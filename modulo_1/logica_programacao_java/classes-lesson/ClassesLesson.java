public class ClassesLesson {

    static class Cao {
			
        // Atributos
        String nome;
        int idade;
        double peso;

        // Construtor padrão (sem parametros)
        public Cao() {
        }

        // Construtor com parametros
        public Cao(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        // Método Andar
        public void Andar() {
            System.out.println("O cachorro esta andando!");
            System.out.println("Peso: " + peso + "kg");
        }

        // Método DadosCao
        public void DadosCao() {
            System.out.println("\n=== Dados do Cao ===");
            System.out.println("Nome  : " + nome);
            System.out.println("Idade : " + idade + " anos");
            System.out.println("Peso  : " + peso + "kg");
            System.out.println("===================");
        }
    }

    public static void main(String args[]) {
        Cao cachorro = new Cao();
        cachorro.peso = 30;
        cachorro.Andar();

        Cao dog = new Cao("Lulu", 12);
        dog.DadosCao();
    }
}