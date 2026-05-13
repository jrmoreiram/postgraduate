public class CompositionLesson {

    // Classe Motor
    static class Motor {
        private String tipo;

        public Motor(String tipo) {
            this.tipo = tipo;
        }

        public void ligar() {
            System.out.println("Motor " + tipo + " ligado!");
        }

        public void desligar() {
            System.out.println("Motor " + tipo + " desligado!");
        }
    }

    // Classe Roda
    static class Roda {
        private int aro;

        public Roda(int aro) {
            this.aro = aro;
        }

        public void girar() {
            System.out.println("Roda aro " + aro + " girando!");
        }
    }

    // Classe Carro COMPOSTA por Motor e Roda
    static class Carro {
        private String modelo;
        private Motor motor;      // TEM UM Motor
        private Roda[] rodas;     // TEM quatro Rodas

        public Carro(String modelo, String tipoMotor, int aroRoda) {
            this.modelo = modelo;
            this.motor = new Motor(tipoMotor);   // composiçao
            this.rodas = new Roda[4];
            for (int i = 0; i < 4; i++) {
                this.rodas[i] = new Roda(aroRoda); // composiçao
            }
        }

        public void ligar() {
            System.out.println("\n " + modelo + " esta ligando...");
            motor.ligar();
        }

        public void desligar() {
            System.out.println("\n " + modelo + " esta desligando...");
            motor.desligar();
        }

        public void andar() {
            System.out.println(modelo + " esta andando:");
            for (int i = 0; i < rodas.length; i++) {
                System.out.print("  Roda " + (i + 1) + ": ");
                rodas[i].girar();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Exemplo de Composicao ===\n");

        Carro carro1 = new Carro("Fusca", "1.6 Flex", 15);
        carro1.ligar();
        carro1.andar();
        carro1.desligar();

        System.out.println();

        Carro carro2 = new Carro("Ferrari", "V8 Turbo", 20);
        carro2.ligar();
        carro2.andar();
        carro2.desligar();
    }
}