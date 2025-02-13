package matriz;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Matriz para armazenar nomes e notas (2 alunos, 1 nome + 3 notas)
        String dados[][] = new String[2][4];

        // Entrada de dados
        for (int i = 0; i < dados.length; i++) {

            // Lê o nome do aluno
            System.out.println("Digite o nome do " + (i + 1) + "º aluno:");
            dados[i][0] = teclado.next(); // Nome na coluna 0

            // Lê as 3 notas do aluno
            for (int j = 1; j <= 3; j++) { // Colunas 1 a 3
                System.out.println("Digite a " + j + "ª nota do aluno:");
                dados[i][j] = teclado.next(); // Notas nas colunas 1, 2 e 3
            }
        }

        // Impressão dos dados
        for (int i = 0; i < dados.length; i++) {

            System.out.println("\nNome do " + (i + 1) + "º aluno: " + dados[i][0]);

            // Imprime as notas
            for (int j = 1; j <= 3; j++) {
                System.out.println("Nota " + j + ": " + dados[i][j]);
            }
        }

        teclado.close();
    }
}
