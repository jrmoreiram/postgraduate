import java.util.Scanner;

public class ConditionalLesson {

    public static void main(String[] args) {
			
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota (0 a 100): ");
        double nota = scanner.nextDouble();

        System.out.print("Digite seu nivel (1-Iniciante, 2-Intermediario, 3-Avancado): ");
        int nivel = scanner.nextInt();

        System.out.println("\n========================================");

        // ---- IF / ELSE IF / ELSE ----
        System.out.println("IF / ELSE IF / ELSE:");
        if (nota >= 90) {
            System.out.println("  Conceito: A - Excelente!");
        } else if (nota >= 75) {
            System.out.println("  Conceito: B - Muito Bom!");
        } else if (nota >= 60) {
            System.out.println("  Conceito: C - Bom!");
        } else if (nota >= 50) {
            System.out.println("  Conceito: D - Regular!");
        } else {
            System.out.println("  Conceito: F - Reprovado!");
        }

        // ---- SWITCH ----
        System.out.println("\nSWITCH:");
        switch (nivel) {
            case 1:
                System.out.println("  Nivel: Iniciante - Bem-vindo ao mundo da programacao!");
                break;
            case 2:
                System.out.println("  Nivel: Intermediario - Voce esta evoluindo!");
                break;
            case 3:
                System.out.println("  Nivel: Avancado - Voce e um expert!");
                break;
            default:
                System.out.println("  Nivel invalido! Digite entre 1 e 3.");
        }

        // ---- TERNARIO ----
        System.out.println("\nTERNARIO:");
        String situacao = (nota >= 60) ? "Aprovado" : "Reprovado";
        System.out.println("  Situacao: " + situacao);

        String dificuldade = (nivel == 1) ? "Facil" : (nivel == 2) ? "Medio" : "Dificil";
        System.out.println("  Dificuldade: " + dificuldade);

        System.out.println("========================================");

        scanner.close();
    }
}