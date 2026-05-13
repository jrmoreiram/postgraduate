public class PolymorphismeLesson {

    static abstract class Forma {
        public abstract void desenhar();
    }

    static class Quadrado extends Forma {
        @Override
        public void desenhar() {
            System.out.println("Desenhando um Quadrado!");
        }
    }

    static class Circulo extends Forma {
        @Override
        public void desenhar() {
            System.out.println("Desenhando um Circulo!");
        }
    }

    public static void main(String args[]) {
        Quadrado q1 = new Quadrado();
        q1.desenhar();

        Circulo c1 = new Circulo();
        c1.desenhar();
    }
}