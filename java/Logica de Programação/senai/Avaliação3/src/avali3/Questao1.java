package avali3;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int quantidade = 2;

        String nome[] = new String[quantidade];
        int idade[] = new int[quantidade];
        float peso[] = new float[quantidade];
        float altura[] = new float[quantidade];

        // Inicializando com valores adequados
        int maioridade = Integer.MIN_VALUE;
        int menoridade = Integer.MAX_VALUE;

        float maiorpeso = Float.MIN_VALUE;
        float menorpeso = Float.MAX_VALUE;

        float maioral = Float.MIN_VALUE;
        float menoral = Float.MAX_VALUE;

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\nDigite os dados da " + (i + 1) + "ª Pessoa");

            System.out.println("Digite o nome");
            nome[i] = teclado.nextLine();

            System.out.println("Digite a idade");
            idade[i] = teclado.nextInt();

            System.out.println("Digite o peso");
            peso[i] = teclado.nextFloat();

            System.out.println("Digite a altura");
            altura[i] = teclado.nextFloat();

            teclado.nextLine();

            // Maior e menor idade
            if (idade[i] >= maioridade) {
                maioridade = idade[i];
            }
            if (idade[i] <= menoridade) {
                menoridade = idade[i];
            }

            // Maior e menor peso
            if (peso[i] >= maiorpeso) {
                maiorpeso = peso[i];
            }
            if (peso[i] <= menorpeso) {
                menorpeso = peso[i];
            }

            // Maior e menor altura
            if (altura[i] >= maioral) {
                maioral = altura[i];
            }
            if (altura[i] <= menoral) {
                menoral = altura[i];
            }
        }

        // Exibição dos dados
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nInformações da " + (i + 1) + "ª Pessoa");
            System.out.println("Nome: " + nome[i]);
            System.out.println("Idade: " + idade[i]);
            System.out.println("Peso: " + peso[i]);
            System.out.println("Altura: " + altura[i]);
        }

        // Exibindo as estatísticas
        System.out.println("\nA Maior idade: " + maioridade);
        System.out.println("A Menor idade: " + menoridade);

        System.out.println("O Maior Peso: " + maiorpeso);
        System.out.println("O Menor Peso: " + menorpeso);

        System.out.println("A Maior Altura: " + maioral);
        System.out.println("A Menor Altura: " + menoral);

        teclado.close();
    }
}
