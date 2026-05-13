public class InheritanceLesson {

    // Classe base (pai)
    static class Animal {
        String nome;

        public Animal(String nome) {
            this.nome = nome;
        }

        public void emitirSom() {
            System.out.println(nome + " emite um som generico.");
        }

        public void dormir() {
            System.out.println(nome + " esta dormindo...");
        }
    }

    // Cachorro HERDA de Animal
    static class Cachorro extends Animal {

        public Cachorro(String nome) {
            super(nome); // chama o construtor do pai
        }

        @Override
        public void emitirSom() {
            System.out.println(nome + " diz: Au Au!");
        }

        public void buscarBola() {
            System.out.println(nome + " foi buscar a bola!");
        }
    }

    // Gato HERDA de Animal
    static class Gato extends Animal {

        public Gato(String nome) {
            super(nome); // chama o construtor do pai
        }

        @Override
        public void emitirSom() {
            System.out.println(nome + " diz: Miau!");
        }

        public void arranharSofa() {
            System.out.println(nome + " esta arranhando o sofa!");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Exemplo de Heranca ===\n");

        Cachorro c1 = new Cachorro("Rex");
        c1.emitirSom();       // método sobrescrito
        c1.dormir();          // método herdado do pai
        c1.buscarBola();      // método próprio do Cachorro

        System.out.println();

        Gato g1 = new Gato("Mimi");
        g1.emitirSom();       // método sobrescrito
        g1.dormir();          // método herdado do pai
        g1.arranharSofa();    // método próprio do Gato
    }
}