package While;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float nota =0;
		
		
		do {
		
		System.out.println("Digite a nota de um aluno ");
		 nota = teclado.nextFloat();
		
		}while(nota<0 || nota >10);
		
		teclado.close();
	}
	
}
