import javax.swing. * ;

class VectorSum {

  public static void main(String args[]) {

    //declarando o vetor VetSum de tamanho 100 do tipo inteiro
    // também declarou as variáveis i e soma, soma já começando com 0

    int VetSum[], i, soma = 0;

    // construindo o vetor no java
    VetSum = new int[100];

    // usando estrutura de repetição para passar pelas 100 posições do vetor.
    // as posições são do 0 até 99
    // dentro da estrutura de repetição, mostra mensagem para o usuário
    //e atribui no vetor
    // também já vai acumulando a soma dos valores do vetor na variável soma

    for (i = 0; i <= 99; i++) {

      VetSum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

      soma = soma + VetSum[i];

    } // for

    // apresentando o valor da soma para o usuário

    System.out.println("A soma dos 100 valores digitados e: " + soma);

      System.exit(0);

    } // void main

 } // classe Somar"