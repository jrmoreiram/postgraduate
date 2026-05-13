public class AbstractClassLesson {

    // Classe abstrata define a BASE comum
    static abstract class Conta {
        private double saldo;

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        // Método abstrato — cada filho OBRIGATORIAMENTE deve implementar
        public abstract void imprimeExtrato();
    }

    // Poupanca HERDA de Conta e implementa imprimeExtrato()
    static class Poupanca extends Conta {

        @Override
        public void imprimeExtrato() {
            System.out.println("=== Extrato Poupanca ===");
            System.out.println("Saldo: R$ " + getSaldo());
            System.out.println("Rendimento mensal: 0,5%");
            System.out.println("=======================\n");
        }
    }

    // Corrente HERDA de Conta e implementa imprimeExtrato()
    static class Corrente extends Conta {

        @Override
        public void imprimeExtrato() {
            System.out.println("=== Extrato Conta Corrente ===");
            System.out.println("Saldo: R$ " + getSaldo());
            System.out.println("Taxa de manutencao: R$ 12,00/mes");
            System.out.println("==============================\n");
        }
    }

    public static void main(String args[]) {
        Conta cp = new Poupanca();
        cp.setSaldo(5000);
        cp.imprimeExtrato();

        Conta cc = new Corrente();
        cc.setSaldo(10000);
        cc.imprimeExtrato();
    }
}