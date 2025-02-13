package avaliação_de_apredizagemII;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nomes = new String[30];
        int[] contatos = new int[30];
        int totalContatos = 0; // Para rastrear o número de contatos cadastrados
        int escolha;

        do {
            System.out.println("======== Sistema da Agenda ========");
            System.out.println("1 - Adicionar novo contato");
            System.out.println("2 - Mostrar contatos e encerrar");
            System.out.print("Escolha uma opção: ");
            escolha = teclado.nextInt();
            teclado.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1:
                    if (totalContatos < 30) {
                        System.out.println("Digite o nome do contato:");
                        nomes[totalContatos] = teclado.nextLine();

                        System.out.println("Digite o número do contato:");
                        contatos[totalContatos] = teclado.nextInt();
                        teclado.nextLine(); // Consumir a quebra de linha

                        totalContatos++;
                    } else {
                        System.out.println("A agenda está cheia! Não é possível adicionar mais contatos.");
                    }
                    break;

                case 2:
                    System.out.println("Exibindo a lista de contatos:");
                    for (int i = 0; i < totalContatos; i++) {
                        System.out.println((i + 1) + " - Nome: " + nomes[i] + ", Telefone: " + contatos[i]);
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 2);

        teclado.close();
    }
}
