package avaliação1;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o valor A : ");
		int A =teclado.nextInt();
		
		System.out.println("Digite o valor de C : ");
		int C = teclado.nextInt();
		
		System.out.println("Digite o valor de B : ");
		int B =teclado.nextInt();
		
		
		int soma =A+B;
		
		if(soma >C) {
			System.out.println("A soma de A+B e maior que C");
		}else {
			System.out.println("A Soma de A+B e menor que C");
		}
		
		teclado.close();
	}
	
}
