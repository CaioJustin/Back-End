package quest;

import java.util.Scanner;

public class Question4 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua idade ");
		int idade = teclado.nextInt();
		
		if(idade >=18) {
			System.out.println("Acesso Permitido");
		}else {
			System.out.println("Acesso Negado ");
		}
		
		
		
		teclado.close();
	}
}
