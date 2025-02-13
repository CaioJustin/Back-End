package While;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int i =0;
	
		
		float soma=0;
		float media=0;
		float nota=0;
		String escolha;
		
		do {
			
			System.out.println("Digite a "+i+" nota do aluno ");
			nota =teclado.nextFloat();
			
			 soma+=nota;
			
			
			 i++;
			 
			 
			System.out.println("deseja adicionar mais uma nota:? N para Negar ");
			escolha =teclado.next();
					
					
		}while(!escolha.equalsIgnoreCase("N"));
		
		 media=soma/i;
		System.out.println("A soma e : "+soma);
		System.out.println("A media e : "+media);
		System.out.println("Repetição : "+i);
		
		
		teclado.close();
	}
}
