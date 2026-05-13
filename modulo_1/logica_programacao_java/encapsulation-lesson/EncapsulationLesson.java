public class EncapsulationLesson {

    static class ContaBancaria {
        // Atributos PRIVADOS — ninguem acessa diretamente
        private String titular;
        private String cpf;
        private double saldo;
        private String senha;

        // Construtor
        public ContaBancaria(String titular, String cpf, String senha) {
            this.titular = titular;
            this.cpf = cpf;
            this.senha = senha;
            this.saldo = 0;
        }

        // GETs — apenas leitura permitida
        public String getTitular() {
            return titular;
        }

        public double getSaldo(String senha) {
            if (validarSenha(senha)) {
                return saldo;
            } else {
                System.out.println("Senha incorreta! Acesso negado.");
                return -1;
            }
        }

        // SET — com validaçao
        public void setSenha(String senhaAtual, String novaSenha) {
            if (validarSenha(senhaAtual)) {
                this.senha = novaSenha;
                System.out.println("Senha alterada com sucesso!");
            } else {
                System.out.println("Senha atual incorreta!");
            }
        }

        // Métodos de negocio com validaçao
        public void depositar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor de deposito invalido!");
                return;
            }
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado!");
        }

        public void sacar(double valor, String senha) {
            if (!validarSenha(senha)) {
                System.out.println("Senha incorreta! Saque negado.");
                return;
            }
            if (valor <= 0) {
                System.out.println("Valor de saque invalido!");
                return;
            }
            if (valor > saldo) {
                System.out.println("Saldo insuficiente!");
                return;
            }
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        }

        // Método PRIVADO — apenas a propria classe pode usar
        private boolean validarSenha(String senha) {
            return this.senha.equals(senha);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Exemplo de Encapsulamento ===\n");

        ContaBancaria conta = new ContaBancaria("Joao Silva", "123.456.789-00", "1234");

        // Deposito
        conta.depositar(1000);
        conta.depositar(-500); // invalido

        // Saque com senha correta e incorreta
        conta.sacar(200, "0000"); // senha errada
        conta.sacar(200, "1234"); // senha correta

        // Consulta de saldo
        System.out.println("Saldo: R$ " + conta.getSaldo("1234")); // correta
        System.out.println("Saldo: R$ " + conta.getSaldo("0000")); // errada

        // Alteraçao de senha
        conta.setSenha("0000", "4321"); // senha atual errada
        conta.setSenha("1234", "4321"); // senha atual correta

        // Titular
        System.out.println("\nTitular: " + conta.getTitular());
    }
}