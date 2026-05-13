public class InterfaceLesson {

    // Interface define o CONTRATO
    interface Conta {
        void depositar(double valor);
        void sacar(double valor);
        double getSaldo();
    }

    // Poupanca IMPLEMENTA a interface Conta
    static class Poupanca implements Conta {
        private double saldo = 0;

        @Override
        public void depositar(double valor) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
        }

        @Override
        public void sacar(double valor) {
            if (valor > saldo) {
                System.out.println("Saldo insuficiente! Saldo atual: R$ " + saldo);
            } else {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            }
        }

        @Override
        public double getSaldo() {
            return saldo;
        }
    }

    public static void main(String args[]) {
        Conta cp = new Poupanca();
        cp.depositar(732);
        cp.sacar(8);
        cp.getSaldo();

        System.out.println("Saldo: R$ " + cp.getSaldo());
    }
}