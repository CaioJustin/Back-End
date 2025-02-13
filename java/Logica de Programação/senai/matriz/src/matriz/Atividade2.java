package matriz;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int j;
        String dados[][] = new String[2][4]; // Nome e 3 notas para cada aluno
        float soma[] = new float[2];
        float media[] = new float[2];

        // Entrada de dados
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º aluno:");
            dados[i][0] = teclado.next();

            for (j = 1; j <= 3; j++) { // Notas começam em dados[i][1]
                System.out.println("Digite a " + j + "ª nota:");
                dados[i][j] = teclado.next();
                soma[i] += Float.parseFloat(dados[i][j]);
            }

            media[i] = soma[i] / 3; // Calcula a média do aluno
        }

        // Exibição dos dados
        for (int i = 0; i < dados.length; i++) {
            System.out.println("\nNome do " + (i + 1) + "º aluno: " + dados[i][0]);
            for (j = 1; j <= 3; j++) {
                System.out.println("Nota " + j + ": " + dados[i][j]);
            }
            System.out.printf("Média: %.2f\n", media[i]);
        }

        teclado.close();
    }
}
