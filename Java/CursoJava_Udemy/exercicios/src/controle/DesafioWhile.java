package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcao;
        double nota, media = 0;
        int notas_validas = 0, notas_invalidas = 0;
        boolean finalizar = false;

        do {

            System.out.print("\n [ Deseja inserir uma nota?\n S - Sim \n N - Não \n\n Escolha: ");
            opcao = sc.next();

            if (opcao.equalsIgnoreCase("s")) {
                System.out.println("\n\n[Sistema de Notas] \n\n Digite uma nota: ");
                nota = sc.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    notas_validas++;
                    media += nota;
                } else {
                    notas_invalidas++;
                    System.out.println("\n\n [ Erro! Nota inválida (entre 0 e 10) ]");
                }
            }

            if (opcao.equalsIgnoreCase("n")) {
                if (notas_validas > 0) { // Verifica se há notas válidas antes de calcular a média
                    media = media / notas_validas;
                    System.out.printf("\n\n[Sistema de Notas] \n\n Média geral da turma: %.2f \n Notas válidas: %d \n Notas Inválidas: %d \n", media, notas_validas, notas_invalidas);
                    System.out.println("[ Obrigado por ter utilizado o programa ]");
                    finalizar = true; // Configura a finalização do loop
                } else {
                    System.out.println("\n\n [ Não há notas válidas para calcular a média ]");
                }
            }

            if (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
                System.out.print("\n  [ Opção inválida! ] (Digite S ou N) \n\n Escolha: ");
                opcao = sc.next();
            }

        } while (!finalizar && (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("n")));

        sc.close(); // Fecha o Scanner para liberar recursos
    }
}
