package ifage;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		String nome = teclado.nextLine();
		
		System.out.println("Digite a sua idade");
		int idade = teclado.nextInt();
		
		
		System.out.println("Digite a sua 1 nota");
		float nota1 = teclado.nextFloat();
		
		
		System.out.println("Digite a sua 2 nota");
		float nota2 = teclado.nextFloat();
		
		
		System.out.println("Digite a sua 3 nota");
		float nota3 = teclado.nextFloat();
		
		float soma = nota1+nota2+nota3;
		int media = (int)soma/3;
		
		
		System.out.println("O Nome do aluno e : "+nome);
		System.out.println("a idade do alunoe : "+idade);
		System.out.println("A media e : "+media );
		
		
		if(media >=7) {
			System.out.println("\nO aluno esta aprovado");
		}else {
			System.out.println("\nO aluno esta reprovando");
		}
		
		
		
		teclado.close();
	}
	
}
