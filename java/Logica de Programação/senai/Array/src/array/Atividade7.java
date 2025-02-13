package array;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int quantidade=5;
		
		String nome[]=new String[quantidade];
		int idade[]=new int[quantidade];
		int i =0;
		
		for(i=0;i<quantidade;i++) {
			
			System.out.println("Digite o nome do "+(i+1)+" aluno : ");
			nome[i] = teclado.next();
			
			System.out.println("Digite a idade do "+(i+1)+" aluno : ");
			idade[i] = teclado.nextInt();
		}
		
		
		for(i=0;i<quantidade;i++) {
			System.out.println("\n");
			System.out.println("[======================]");
			System.out.println("|Nome : "+nome[i]+"    |");
			System.out.println("|idade: "+idade[i]+"   |");
			System.out.println("[======================]");

			
		}
		
		teclado.close();
	}
	
}
